package pizza.pizza;

import pizza.ingredients.Ingredient;
import pizza.ingredients.NameIngredient;

import java.util.ArrayList;

public class PizzaMargarita extends Pizza{
    public PizzaMargarita() {
        super("Маргарита пицца");
        super.setType(PizzaType.MARGARITA);
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public ArrayList<Ingredient> meatIngredient(ArrayList<Ingredient> ingredients){
        ingredients.add(new Ingredient(NameIngredient.HAM, 50)) ;
        ingredients.add(new Ingredient(NameIngredient.OLIVES, 50)) ;
        ingredients.add(new Ingredient(NameIngredient.CHEESE, 50)) ;
        ingredients.add(new Ingredient(NameIngredient.ONION, 10)) ;
        ingredients.add(new Ingredient(NameIngredient.BELLPEPPER, 30)) ;
        return ingredients;
    }
}
