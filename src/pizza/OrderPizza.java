package pizza;

import menu.Order;
import pizza.pizza.Pizza;

import java.util.ArrayList;

public class OrderPizza implements Order {
    ArrayList<Pizza> pizza;
    private double costPizza;
    private double cost;

    public OrderPizza(ArrayList<Pizza> pizza) {
        this.pizza = pizza;
    }

    @Override
    public void printCheck() {
        System.out.println("Пицца: ");
        for (int i = 0; i < pizza.size(); i++) {
            System.out.printf("%s - %.2f\n", pizza.get(i).getName() ,pizza.get(i).getCost());
            cost += pizza.get(i).getCost();
        }
        System.out.printf("    за пиццу %.2f\n", cost);
    }

    @Override
    public double getCost() {
        return cost;
    }
}
