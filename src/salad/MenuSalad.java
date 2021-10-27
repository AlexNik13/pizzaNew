package salad;

import BD.Price;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuSalad {
    private Scanner in = new Scanner(System.in);
    private ArrayList<Salad> salads = new ArrayList<>();
    private ArrayList<String> nameSalad = new ArrayList<>(Price.priceSalad.keySet());

    public ArrayList<Salad> menuSalad() {
        while (true) {
            int i = 1;
            for (String nameSalad : nameSalad) {
                System.out.println(i++ + ". " + nameSalad);
            }
            System.out.println("0. Вернуться назад.");
            System.out.println("Выберете салат: ");
            int choice = in.nextInt();
            if (choice == 0) {
                break;
            }

            System.out.print("Введите количество порций: ");
            int portion = in.nextInt();
            try {
                String name = nameSalad.get(choice - 1);
                double cost = Price.priceSalad.get(name);
                salads.add(new Salad(name, portion));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("----------------\nневерный выбор\n----------------");
            }
        }
        return salads;
    }
}
