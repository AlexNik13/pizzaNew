package menu;

import drink.MenuDrink;
import pizza.MenuPizza;
import salad.MenuSalad;

import java.util.Scanner;

public class MainMenu {
    private Check check = new Check();
    private Scanner in = new Scanner(System.in);

    public MainMenu() {
    }

    public void start() {

        boolean menu = true;
        while (menu){
            System.out.println("1. Заказать пиццу.");
            System.out.println("2. Заказать напиток.");
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

                /*case 2:
                    check.addOrderDrink(new MenuSalad().menuSalad());
                    break;*/
                case 3:
                    check.addOrderDrink(new MenuDrink().menuDrink());
                    break;
            }
        }

        check.printCheck();


    }
}
