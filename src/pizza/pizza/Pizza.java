package pizza.pizza;

import pizza.ingredients.Ingredient;

public abstract class Pizza {
    private PizzaType type;
    private String name;
    private double costPizza;
    private Ingredient[] ingredients = new Ingredient[3];

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

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }


    public double costPizza() {
        costPizza = 0;
        for (int i = 0; i < ingredients.length; i++) {
            costPizza += (ingredients[i].getCost() / 1000) * ingredients[i].getQuantity();
        }
        return costPizza;
    }

    public Ingredient[] getBaseIngredients() {
        Ingredient[] ingredients = new Ingredient[3];
        ingredients[0] = new Ingredient("Тесто", 50, 100);
        ingredients[1] = new Ingredient("Сыр", 50, 100);
        ingredients[2] = new Ingredient("Соус", 50, 50);
        return ingredients;
    }

    public void setType(PizzaType type) {
        this.type = type;
    }
}
