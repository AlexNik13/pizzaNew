package menu;

import drink.Drink;
import drink.OrderDrink;
import menu.Order;
import pizza.OrderPizza;
import pizza.pizza.Pizza;
import salad.OrderSalad;
import salad.Salad;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Check {
    private ArrayList<Order> orders;

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
        double cost = 0;
        System.out.println("Чек\n_____________");
        for (Order order : orders ){
            order.printCheck();
            cost += order.getCost();
        }
        System.out.printf("Итого %.2f\n", cost);
    }
}
