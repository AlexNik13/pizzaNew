package menu;

import drink.Drink;
import drink.OrderDrink;
import pizza.OrderPizza;
import pizza.pizza.Pizza;
import salad.OrderSalad;
import salad.Salad;

import java.util.ArrayList;

public class Check {
    private ArrayList<Order> orders;
    private double cost;
    public Check() {
        orders = new ArrayList<>();
    }

    public void addOrderDrink(ArrayList<Drink> drinks ){
        orders.add(new OrderDrink(drinks));
    }

    public void addOrderPizza(ArrayList<Pizza> pizzas ){
        orders.add(new OrderPizza(pizzas));
    }

    public void addOrderSalad(ArrayList<Salad> salads ){
        orders.add(new OrderSalad(salads));
    }

    public void printCheck(){
        cost = 0;
        System.out.println("Чек\n_____________");
        for (Order order : orders ){
            order.printCheck();
            cost += order.getCost();
        }
        System.out.println("_____________");
        System.out.printf("\n   Итого %.2f\n", cost);
    }

    public double getCost() {
        return cost;
    }
}
