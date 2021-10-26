package pizza;

import pizza.ingredients.Ingredient;
import pizza.ingredients.NameIngredient;
import pizza.pizza.Pizza;
import pizza.pizza.PizzaType;

import java.util.Scanner;

public class Menu {

    static Scanner in = new Scanner(System.in);
    private  MyPizzaria pizzaria = new MyPizzaria();

    public Menu() {
    }

    public Pizza[] start() {
        Pizza[] pizza = new Pizza[0];
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
                    Order order = new Order(pizza);
                    order.printCheck();
                    break;
                case 1:
                    pizza = addPizza(pizza, PizzaType.MEAT);
                    break;
                case 2:
                    pizza = addPizza(pizza, PizzaType.VEGETAN);
                    break;
                case 3:
                    pizza = addPizza(pizza, PizzaType.MARGARITA);
                    break;
                case 4:
                    pizza = addPizza(pizza, PizzaType.AUTHOR);
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

    private Pizza[] addPizza(Pizza[] pizza, PizzaType type) {
        Pizza[] addPizza = new Pizza[pizza.length + 1];
        for (int i = 0; i < pizza.length; i++) {
            addPizza[i] = pizza[i];
        }
        addPizza[pizza.length] = pizzaria.createPizza(type);
        addPizza[pizza.length] = makeAddIngredient(addPizza[pizza.length]);
        return addPizza;
    }

    private Ingredient[] addIngredient() {
        Ingredient[] addIngredient = new Ingredient[0];
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
                    addIngredient = addIngredient(addIngredient, NameIngredient.MEAT);
                    break;
                case 2:
                    addIngredient = addIngredient(addIngredient, NameIngredient.BACON);
                    break;
                case 3:
                    addIngredient = addIngredient(addIngredient, NameIngredient.HAM);
                    break;
                case 4:
                    addIngredient = addIngredient(addIngredient, NameIngredient.BELLPEPPER);
                    break;
                case 5:
                    addIngredient = addIngredient(addIngredient, NameIngredient.ONION);
                    break;
                case 6:
                    addIngredient = addIngredient(addIngredient, NameIngredient.OLIVES);
                    break;
                case 7:
                    addIngredient = addIngredient(addIngredient, NameIngredient.BROCCOLI);
                    break;
                case 8:
                    addIngredient = addIngredient(addIngredient, NameIngredient.MUSHROOMS);
                    break;
                case 9:
                    addIngredient = addIngredient(addIngredient, NameIngredient.SAUSAGE);
                    break;
            }
        }
        return addIngredient;
    }

    private Ingredient[] addIngredient(Ingredient[] ingredient, NameIngredient type) {
        Ingredient[] addIngredient = new Ingredient[ingredient.length + 1];

        for (int i = 0; i < ingredient.length; i++) {
            addIngredient[i] = ingredient[i];
        }
        addIngredient[ingredient.length] = new Ingredient(type, 50);
        return addIngredient;
    }
}
