package pizza.pizza;

public class PizzaAutor extends Pizza{
    public PizzaAutor() {
        super("Своя пицца");
        super.setType(PizzaType.AUTHOR);
        super.costPizza();
    }
}
