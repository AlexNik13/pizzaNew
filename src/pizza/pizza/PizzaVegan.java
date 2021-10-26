package pizza.pizza;

import pizza.ingredients.Ingredient;
import pizza.ingredients.NameIngredient;

import java.util.ArrayList;

public class PizzaVegan extends Pizza {
    public PizzaVegan() {
        super("Вегетарианская пицца");
        super.setType(PizzaType.VEGETAN);
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public ArrayList<Ingredient> meatIngredient(ArrayList<Ingredient> ingredients){
        ingredients.add(new Ingredient(NameIngredient.MUSHROOMS, 50))  ;
        ingredients.add(new Ingredient(NameIngredient.OLIVES, 50 ));
        ingredients.add(new Ingredient(NameIngredient.TOMATO, 50));
        ingredients.add( new Ingredient(NameIngredient.ONION, 50));
        ingredients.add( new Ingredient(NameIngredient.BELLPEPPER, 30));
        return ingredients;
    }
}
