package pizza.ingredients;

public class Ingredient {

    private String name;
    private double cost;
    private int quantity;

    public Ingredient(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Ingredient(NameIngredient type, int quantity) {
        this.name = type.toString();
        this.cost = type.getCost();
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
