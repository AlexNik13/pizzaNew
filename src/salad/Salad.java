package salad;

import BD.Price;
import BD.PriceIngredient;
import BD.Recipe;

import java.util.Map;

public class Salad {
    private String name;
    private double cost;
    private int portion;
    private Map<String, Integer> recipe;

    public Salad(String name, int portion) {
        this.name = name;
        this.portion = portion;
        this.recipe = recipe(name);
        this.cost = countCost();
    }

    private double countCost(){
        double cost = 0;
        for (Map.Entry<String, Integer> ingredient : recipe.entrySet()){
            cost += ingredient.getValue() * ( PriceIngredient.price.get(ingredient.getKey()) /1000);
        }
        return cost;
    }

    private Map<String, Integer> recipe(String name){
        switch (name){
            case "Королевский":  return Recipe.saladRoyal();
            case "Ёжик":  return new Recipe().saladHedgehog();
            case "Мужские слезы":  return new Recipe().saladMenTear();
            case "Красное море":  return new Recipe().saladRedSea();
            case "«Обжорка» с курицей":  return new Recipe().saladGluttony();
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public int getPortion() {
        return portion;
    }

    public void setPortion(int portion) {
        this.portion = portion;
    }
}
