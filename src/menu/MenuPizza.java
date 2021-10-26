package menu;

import pizza.MyPizzaria;
import pizza.ingredients.Ingredient;
import pizza.ingredients.NameIngredient;
import pizza.pizza.Pizza;
import pizza.pizza.PizzaType;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuPizza {

    private Scanner in = new Scanner(System.in);
    private MyPizzaria pizzaria = new MyPizzaria();

    public MenuPizza() {
    }

    public ArrayList<Pizza> start() {
        ArrayList<Pizza> pizza = new ArrayList<>();
        boolean menu = true;

        while (menu) {
            System.out.println("Menu");
            System.out.println("1. Мясная пицца");
            System.out.println("2. Вегатареанская пицца");
            System.out.println("3. Маргарита пицца");
            System.out.println("4. Своя пицца");
            System.out.println("0. Посчитать");

            int choice = in.nextInt();
            switch (choice) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    pizza.add(addPizza(PizzaType.MEAT));
                    break;
                case 2:
                    pizza.add(addPizza(PizzaType.VEGETAN));
                    break;
                case 3:
                    pizza.add(addPizza(PizzaType.MARGARITA));
                    break;
                case 4:
                    pizza.add(addPizza(PizzaType.AUTHOR));
                    break;
            }
        }
        return pizza;
    }

    private Pizza makeAddIngredient(Pizza pizza) {
        System.out.println("Добавить ингридиенты 1 - да. 2 - нет.");
        int choice = in.nextInt();
        if (choice == 1) {
            pizza = pizzaria.addIngredients(pizza, addIngredient());
        }
        return pizza;
    }

    private Pizza addPizza(PizzaType type) {
        Pizza pizza = pizzaria.createPizza(type);
        pizza = makeAddIngredient(pizza);
        return pizza;
    }

    private ArrayList<Ingredient> addIngredient() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        boolean menu = true;

        while (menu) {
            System.out.println("Выберети ингридиент");
            System.out.println("1. Мясо");
            System.out.println("2. Бекон");
            System.out.println("3. Ветчина");
            System.out.println("4. Перец");
            System.out.println("5. Лук");
            System.out.println("6. Оливки");
            System.out.println("7. Брокколи");
            System.out.println("8. Гребы");
            System.out.println("9. Колбаса");
            System.out.println("0. Хватит");

            int choice = in.nextInt();

            switch (choice) {
                case 0:
                    menu = false;
                    break;
                case 1:
                    ingredients.add(new Ingredient(NameIngredient.MEAT, 100));
                    break;
                case 2:
                    ingredients.add(new Ingredient(NameIngredient.BACON, 100));
                    break;
                case 3:
                    ingredients.add(new Ingredient(NameIngredient.HAM, 100));
                    break;
                case 4:
                    ingredients.add(new Ingredient(NameIngredient.BELLPEPPER, 100));
                    break;
                case 5:
                    ingredients.add(new Ingredient(NameIngredient.ONION, 100));
                    break;
                case 6:
                    ingredients.add(new Ingredient(NameIngredient.OLIVES, 100));
                    break;
                case 7:
                    ingredients.add(new Ingredient(NameIngredient.BROCCOLI, 100));
                    break;
                case 8:
                    ingredients.add(new Ingredient(NameIngredient.MUSHROOMS, 100));
                    break;
                case 9:
                    ingredients.add(new Ingredient(NameIngredient.SAUSAGE, 100));
                    break;
            }
        }
        return ingredients;
    }

}
