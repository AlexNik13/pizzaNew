package menu;

import drink.Drink;
import drink.OrderDrink;
import menu.Order;
import pizza.OrderPizza;
import pizza.pizza.Pizza;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Check {
    private ArrayList<Order> orders;

    public Check() {
        orders = new ArrayList<>();
    }

    public void addOrderDrink(ArrayList<Drink> drink ){
        orders.add(new OrderDrink(drink));
    }

    public void addOrderPizza(ArrayList<Pizza> pizza ){
        orders.add(new OrderPizza(pizza));
    }

    public void printCheck(){
        double cost = 0;
        System.out.println("Чек");
        for (Order order : orders ){
            order.printCheck();
            cost += order.getCost();
        }
        System.out.println("Итого: " + cost);
    }
}
