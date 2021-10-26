package salad;

import BD.Price;
import drink.Drink;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSalad {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Salad> salads = new ArrayList<>();
    private ArrayList<String> nameSalad = new ArrayList<>(Price.priceDrink.keySet());


    public ArrayList<Salad> menuSalad() {

        while (true){
            int i = 1;
            for (String nameDrink : nameSalad){
                System.out.println(i++ + ". " + nameDrink);
            }
            System.out.println("0. Вернуться назад.");
            System.out.println("Выберете напиток: ");
            int choice = in.nextInt();
            if (choice == 0){
                break;
            }

            System.out.print("Введите количество порций: ");
            int portion = in.nextInt();
            String name = nameSalad.get(choice - 1);
            double cost = Price.priceDrink.get(name);
            salads.add(new Salad(name, cost, portion));
        }
        return salads;
    }
}
