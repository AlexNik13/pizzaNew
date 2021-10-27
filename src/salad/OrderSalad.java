package salad;

import menu.Order;

import java.util.ArrayList;

public class OrderSalad implements Order {
    private ArrayList<Salad> salads;
    private double costSalad;
    private double cost;

    public OrderSalad(ArrayList<Salad> salads) {
        this.salads = salads;
    }

    @Override
    public void printCheck() {
        System.out.println("\nСалаты: ");
        for (Salad salad : salads) {
            System.out.printf("%s (%s * %.2f) = %.2f \n", salad.getName(), salad.getPortion(), salad.getCost(), (salad.getCost() * salad.getPortion()));
            cost += salad.getCost() * salad.getPortion();
        }
    }

    @Override
    public double getCost() {
        return cost;
    }
}
