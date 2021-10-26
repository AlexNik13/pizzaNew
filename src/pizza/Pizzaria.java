package pizza;

import pizza.ingredients.Ingredient;
import pizza.pizza.Pizza;
import pizza.pizza.PizzaType;

public interface Pizzaria {

    Pizza createPizza(PizzaType type);

    Pizza addIngredients (Pizza pizza, Ingredient[] additionalIngredients);

    Ingredient[] getBaseIngredients();
}
