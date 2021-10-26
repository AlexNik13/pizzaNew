import menu.MenuPizza;
import menu.Order;
import pizza.OrderPizza;

import java.util.ArrayList;

public class Programm {

    public static void main(String[] args) {
        MenuPizza menuPizza = new MenuPizza();
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new OrderPizza( menuPizza.start()));
    }
}
