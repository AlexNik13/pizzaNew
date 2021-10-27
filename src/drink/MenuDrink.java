package drink;

import BD.Price;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrink {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Drink> drinks = new ArrayList<>();
    private ArrayList<String> nameDrink = new ArrayList<>(Price.priceDrink.keySet());

    public ArrayList<Drink> menuDrink() {
        while (true){
            int i = 1;
            for (String nameDrink : nameDrink){
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
            try {
                String name = nameDrink.get(choice - 1);
                double cost = Price.priceDrink.get(name);
                drinks.add(new Drink(name, cost, portion));
            }catch (IndexOutOfBoundsException e){
                System.out.println("----------------\nневерный выбор\n----------------");
            }
        }
        return drinks;
    }
}
