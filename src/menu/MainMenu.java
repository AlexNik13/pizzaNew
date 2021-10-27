package menu;

import drink.MenuDrink;
import pizza.MenuPizza;
import salad.MenuSalad;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Check> checks = new ArrayList<>();

    public MainMenu() {
    }

    public boolean newCustomer() {
        System.out.println();
        System.out.println("1. Новый клиент.");
        System.out.println("2. Выручка за смену.");
        System.out.println("0. Выход.");
        int choice = in.nextInt();
        switch (choice){
            case 1:
                checks.add(start());
                break;
            case 2:
                System.out.printf("\n   Прибыль = %.2f\n", printProfit());
                break;

            default:
                System.exit(0);
                break;
        }
        return true;
    }

    public Check start() {
        Check check = new Check();
        boolean menu = true;
        while (menu) {
            System.out.println("1. Заказать пиццу.");
            System.out.println("2. Заказать салат.");
            System.out.println("3. Заказать напиток.");
            System.out.println("0. Посчитать.");
            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    menu = false;
                    break;

                case 1:
                    check.addOrderPizza(new MenuPizza().menuPizza());
                    break;

                case 2:
                    check.addOrderSalad(new MenuSalad().menuSalad());
                    break;
                case 3:
                    check.addOrderDrink(new MenuDrink().menuDrink());
                    break;
            }
        }
        check.printCheck();
        return check;
    }

    private double printProfit (){
        double cost = 0;
        for (Check check : checks){
            cost += check.getCost();
        }
        return cost;
    }
}
