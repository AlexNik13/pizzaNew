package pizza;

import pizza.pizza.Pizza;

public class Order {
    Pizza[] pizza;
    private double costPizza;
    double cost;

    public Order(Pizza[] pizza) {
        this.pizza = pizza;
    }

    public void printCheck() {
        System.out.println("Чек");
        for (int i = 0; i < pizza.length; i++) {
            System.out.printf("%s - %.2f\n", pizza[i].getName() ,pizza[i].getCost());
            cost += pizza[i].getCost();
        }
        System.out.printf("Итого %.2f\n", cost);

    }
}
