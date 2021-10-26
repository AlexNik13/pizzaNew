package salad;

import drink.Drink;
import menu.Order;

import java.util.ArrayList;

public class OrderSalad implements Order {
    private ArrayList<Salad> salads ;
    private double costSalad;
    private double cost;

    public OrderSalad(ArrayList<Salad> salads) {
        this.salads = salads;
    }

    @Override
    public void printCheck() {
        System.out.println("Салаты: ");
        for (Salad salad : salads){
            System.out.printf("%s (%s * %.2f) = %.2f \n", salad.getName(), salad.getPortion() ,salad.getCost(), (salad.getCost() * salad.getPortion()));
            cost += salad.getCost() * salad.getPortion();
        }
        System.out.printf("    за напитки %.2f\n", cost);
    }

    @Override
    public double getCost() {
        return cost;
    }
}
