package BD;

import java.util.HashMap;
import java.util.Map;

public class Recipe {


    public static Map<String, Integer> saladRoyal(){
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Яйца",120);
        recipe.put("Крабовые палочки",240);
        recipe.put("Сыр твердый",300);
        recipe.put("Сухарики",100);
        recipe.put("Чеснок",20);
        recipe.put("Лимон (сок)",500);
        recipe.put("Майонез",100);
        return recipe;
    }

    public static Map<String, Integer> saladHedgehog(){
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Яйца",90);
        recipe.put("Сыр твердый",100);
        recipe.put("Чеснок",10);
        recipe.put("Колбаса копченая",100);
        recipe.put("Майонез",80);
        recipe.put("Кукуруза консервированная",100);
        return recipe;
    }

    public static Map<String, Integer> saladMenTear(){
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Куриная грудка отварная",250);
        recipe.put("Морковь",250);
        recipe.put("Горошек",250);
        recipe.put("Сыр",150);
        recipe.put("Яйца",90);
        recipe.put("Лук",100);
        recipe.put("Майонез",350);
        return recipe;
    }


    public Map<String, Integer> saladRedSea(){
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Крабовые палочки",300);
        recipe.put("Помидоры",200);
        recipe.put("Сыр",150);
        recipe.put("Чеснок",90);
        recipe.put("Майонез",350);
        return recipe;
    }

    public Map<String, Integer> saladGluttony(){
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("Филе куриное",500);
        recipe.put("Морковь",200);
        recipe.put("Лук",150);
        recipe.put("Чеснок",90);
        recipe.put("Огурцы маринованные",250);
        recipe.put("Майонез",350);
        recipe.put("Куриная грудка отварная",250);;
        return recipe;
    }
}
