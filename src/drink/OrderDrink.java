package drink;

import menu.Order;

import java.util.ArrayList;

public class OrderDrink implements Order {
    private ArrayList<Drink> drinks = new ArrayList<>();
<<<<<<< HEAD
=======
    private double cost;
>>>>>>> bccd5b2




    @Override
    public void printCheck() {
<<<<<<< HEAD

=======
        System.out.println("Напитки: ");
        for (Drink drink : drinks){
            System.out.printf("%s (%s) - %.2f\n", drink.getName(), drink.getPortion() ,drink.getCost());
            cost += drink.getCost() * drink.getPortion();
        }
        System.out.printf("    за напитки %.2f\n", cost);
>>>>>>> bccd5b2
    }

    @Override
    public double getCost() {
        return cost;
    }
}
