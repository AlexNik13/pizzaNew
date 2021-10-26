package pizza;

import pizza.ingredients.Ingredient;
import pizza.pizza.Pizza;
import pizza.pizza.PizzaType;

import java.util.ArrayList;

public interface Pizzaria {

    Pizza createPizza(PizzaType type);

    Pizza addIngredients (Pizza pizza, ArrayList<Ingredient> additionalIngredients);

    Ingredient[] getBaseIngredients();
}
