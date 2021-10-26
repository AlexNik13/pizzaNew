package pizza.pizza;

import pizza.ingredients.Ingredient;

import java.util.ArrayList;

public abstract class Pizza {
    private PizzaType type;
    private String name;
    private double costPizza;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    Pizza(String name) {
        this.name = name;
        ingredients = getBaseIngredients();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return costPizza;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }


    public double costPizza() {
        costPizza = 0;
        for (Ingredient ingredient :ingredients ){
            costPizza += ingredient.getCost() / 1000 * ingredient.getQuantity();
        }

        return costPizza;
    }

    public ArrayList<Ingredient> getBaseIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("Тесто", 50, 100)) ;
        ingredients.add(new Ingredient("Сыр", 50, 100)) ;
        ingredients.add(new Ingredient("Соус", 50, 50)) ;
        return ingredients;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }
}
