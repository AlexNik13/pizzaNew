package BD;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Price {
    private static Map<String, Double> priceDrinkTea = new HashMap<>();
    private static Map<String, Double> priceDrinkNoAlcohol = new HashMap<>();
    private static Map<String, Double> priceDrinkAlcohol = new HashMap<>();
    public static Map<String, Double> priceDrink = new LinkedHashMap<>();


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
    }
}
