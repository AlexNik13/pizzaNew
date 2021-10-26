package pizza.pizza;

import pizza.ingredients.Ingredient;

public class PizzaMeat extends Pizza{

    public PizzaMeat() {
        super("Мясная пицца");
        super.setType(PizzaType.MEAT);
        setIngredients(meatIngredient(getIngredients()));
        super.costPizza();
    }

    public Ingredient[] meatIngredient(Ingredient[] ingredients){
        Ingredient[] temp = new Ingredient[ingredients.length + 5];
        int i = 0;
        for(; i < ingredients.length; i++){
            temp[i] = ingredients[i];
        }
        temp[i] = new Ingredient("Мясо", 135, 50);
        temp[i + 1] = new Ingredient("Мясо", 135, 50);
        temp[i + 2] = new Ingredient("Колбаса", 235, 50);
        temp[i + 3] = new Ingredient("Оливки", 348, 10);
        temp[i + 4] = new Ingredient("Помидоры", 35, 30);
        return temp;
    }
}
