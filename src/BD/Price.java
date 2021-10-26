package BD;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Price {
<<<<<<< HEAD
    private static Map<String, Double> priceDrinkTea = new HashMap<>();
    private static Map<String, Double> priceDrinkNoAlcohol = new HashMap<>();
    private static Map<String, Double> priceDrinkAlcohol = new HashMap<>();
    public static Map<String, Double> priceDrink = new LinkedHashMap<>();
=======
    private static final Map<String, Double> priceDrinkTea = new HashMap<>();
    private static final Map<String, Double> priceDrinkNoAlcohol = new HashMap<>();
    private static final Map<String, Double> priceDrinkAlcohol = new HashMap<>();
    public static final Map<String, Double> priceDrink = new LinkedHashMap<>();
    public static final Map<String, Double> salad = new LinkedHashMap<>();
>>>>>>> bccd5b2


    static {
        priceDrinkTea.put("Чай черный", 15.);
        priceDrinkTea.put("Чай зеленый", 15.);
        priceDrinkTea.put("Чай облепиховый", 35.);
        priceDrinkTea.put("Чай с имбирём", 20.);
        priceDrinkTea.put("Чай индийский три слона", 50.);

        priceDrinkNoAlcohol.put("Cola", 35.);
        priceDrinkNoAlcohol.put("Sprite", 35.);
        priceDrinkNoAlcohol.put("Сок", 40.);
        priceDrinkNoAlcohol.put("Fresh", 85.);

        priceDrinkAlcohol.put("Пиво", 55.);
        priceDrinkAlcohol.put("Виски", 150.);
        priceDrinkAlcohol.put("Водка", 100.);

        priceDrink.putAll(priceDrinkTea);
        priceDrink.putAll(priceDrinkNoAlcohol);
        priceDrink.putAll(priceDrinkAlcohol);

        salad.put("Королевский", 85.);
        salad.put("Ёжик", 45.);
        salad.put("Мужские слезы", 89.);
        salad.put("Красное море", 76.);
        salad.put("Салат из грибов и курицы", 60.);
        salad.put("«Обжорка» с курицей", 99.);

    }
}
