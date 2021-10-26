package salad;

import drink.Drink;
import menu.Order;

import java.util.ArrayList;

public class OrderSalad implements Order {
    private ArrayList<Salad> salads  = new ArrayList<>();
    private double costSalad;
    private double cost;

    public OrderSalad(ArrayList<Salad> salads) {
        this.salads = salads;
    }

    @Override
    public void printCheck() {

    }

    @Override
    public double getCost() {
        return 0;
    }
}
