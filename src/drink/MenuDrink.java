package drink;

import BD.Price;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrink {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<String> nameDrink = new ArrayList<>(Price.priceDrink.keySet());


    public MenuDrink() {
    }



    public static void main(String[] args) {
        System.out.println("Напитки");

    }
}
