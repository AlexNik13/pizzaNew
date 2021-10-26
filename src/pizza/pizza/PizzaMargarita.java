package pizza.pizza;

import pizza.ingredients.Ingredient;
import pizza.ingredients.NameIngredient;

public class PizzaMargarita extends Pizza{
    public PizzaMargarita() {
        super("Маргарита пицца");
        super.setType(PizzaType.MARGARITA);
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public Ingredient[] meatIngredient(Ingredient[] ingredients){
        Ingredient[] temp = new Ingredient[ingredients.length + 5];
        int i = 0;
        for(; i < ingredients.length; i++){
            temp[i] = ingredients[i];
        }
        temp[i] = new Ingredient(NameIngredient.HAM, 50);
        temp[i + 1] = new Ingredient(NameIngredient.OLIVES, 50);
        temp[i + 2] = new Ingredient(NameIngredient.CHEESE, 50);
        temp[i + 3] = new Ingredient(NameIngredient.ONION, 10);
        temp[i + 4] = new Ingredient(NameIngredient.BELLPEPPER, 30);
        return temp;
    }
}
