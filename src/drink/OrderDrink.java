package drink;

import menu.Order;

import java.util.ArrayList;

public class OrderDrink implements Order {
    private ArrayList<Drink> drinks = new ArrayList<>();
    private double costPizza;
    private double cost;

    public OrderDrink(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public void printCheck() {
        System.out.println("Напитки: ");
        for (Drink drink : drinks){
            System.out.printf("%s (%s) - %.2f\n", drink.getName(), drink.getPortion() ,drink.getCost());
            cost += drink.getCost();
        }
        System.out.printf("    за напитки %.2f\n", cost);
    }
}
