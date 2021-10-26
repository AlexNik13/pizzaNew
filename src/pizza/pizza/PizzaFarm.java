
package pizza.pizza;

import pizza.ingredients.Ingredient;

public class PizzaFarm extends Pizza {

    public PizzaFarm() {
        super("Фермерская пицца");
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
        temp[i + 1] = new Ingredient("Бекон", 105, 50);
        temp[i + 2] = new Ingredient("Домашня колбаса", 235, 50);
        temp[i + 3] = new Ingredient("Лук", 18, 10);
        temp[i + 4] = new Ingredient("Помидоры", 35, 30);
        return temp;
    }
}
