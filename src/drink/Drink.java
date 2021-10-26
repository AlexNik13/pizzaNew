package drink;

import java.util.Scanner;

public class Drink {
    private String name;
    private double cost;
    private int portion;

    public Drink(String name, double cost, int portion) {
        this.name = name;
        this.cost = cost;
        this.portion = portion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
