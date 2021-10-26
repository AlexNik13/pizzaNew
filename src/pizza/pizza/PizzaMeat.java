package pizza.pizza;

import pizza.ingredients.Ingredient;

import java.util.ArrayList;

public class PizzaMeat extends Pizza{

    public PizzaMeat() {
        super("Мясная пицца");
        super.setType(PizzaType.MEAT);
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public ArrayList<Ingredient> meatIngredient(ArrayList<Ingredient> ingredients){
        ingredients.add(new Ingredient("Мясо", 135, 50))  ;
        ingredients.add(new Ingredient("Мясо", 135, 50)) ;
        ingredients.add(new Ingredient("Колбаса", 235, 50)) ;
        ingredients.add(new Ingredient("Оливки", 348, 10)) ;
        ingredients.add(new Ingredient("Помидоры", 35, 30)) ;
        return ingredients;
    }
}
