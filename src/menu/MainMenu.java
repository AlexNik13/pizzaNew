package menu;

import drink.MenuDrink;
import drink.OrderDrink;
import pizza.OrderPizza;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    private ArrayList<Order> orders = new ArrayList<>();
    private Scanner in = new Scanner(System.in);

    public MainMenu() {
    }

    public void start() {
        System.out.println("1. Заказать пиццу.");
        System.out.println("2. Заказать напиток.");
        System.out.println("0. Посчитать.");

        int choice = in.nextInt();

        switch (choice) {
            case 1:
                orders.add(new OrderPizza(new MenuPizza().start()));
                break;

            case 2:
                orders.add(new OrderDrink(new MenuDrink().menuDrink()));
                break;
        }


    }
}
