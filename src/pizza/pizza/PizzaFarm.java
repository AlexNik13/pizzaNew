
package pizza.pizza;

import pizza.ingredients.Ingredient;

import java.util.ArrayList;

public class PizzaFarm extends Pizza {

    public PizzaFarm() {
        super("Фермерская пицца");
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public ArrayList<Ingredient> meatIngredient(ArrayList<Ingredient> ingredients){
        ingredients.add(new Ingredient("Мясо", 135, 50)) ;
        ingredients.add(new Ingredient("Бекон", 105, 50)) ;
        ingredients.add(new Ingredient("Домашня колбаса", 235, 50)) ;
        ingredients.add(new Ingredient("Лук", 18, 10)) ;
        ingredients.add(new Ingredient("Помидоры", 35, 30)) ;
        return ingredients;
    }
}
