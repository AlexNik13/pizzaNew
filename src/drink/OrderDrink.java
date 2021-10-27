package drink;

import menu.Order;

import java.util.ArrayList;

public class OrderDrink implements Order {
    private ArrayList<Drink> drinks = new ArrayList<>();

    private double cost;

    public OrderDrink(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public void printCheck() {
        System.out.println("\nНапитки: ");
        for (Drink drink : drinks) {
            System.out.printf("%s (%s * %.2f) = %.2f \n", drink.getName(), drink.getPortion(), drink.getCost(), (drink.getCost() * drink.getPortion()));
            cost += drink.getCost() * drink.getPortion();
        }
    }

    @Override
    public double getCost() {
        return cost;
    }
}
