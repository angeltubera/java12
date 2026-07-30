package java;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int category, choice;

        System.out.println("=== MENU ===");
        System.out.println("1. Burger");
        System.out.println("2. Fries");
        System.out.println("3. Drinks");
        System.out.print("Choose a category: ");
        category = input.nextInt();

        switch (category) {

            case 1:
                System.out.println("\n--- BURGER MENU ---");
                System.out.println("1. Cheeseburger");
                System.out.println("2. Chicken Burger");
                System.out.println("3. Bacon Burger");
                System.out.print("Choose your burger: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You ordered: Cheeseburger");
                        break;
                    case 2:
                        System.out.println("You ordered: Chicken Burger");
                        break;
                    case 3:
                        System.out.println("You ordered: Bacon Burger");
                        break;
                    default:
                        System.out.println("Invalid burger choice!");
                }
                break;

            case 2:
                System.out.println("\n--- FRIES MENU ---");
                System.out.println("1. Small Fries");
                System.out.println("2. Medium Fries");
                System.out.println("3. Large Fries");
                System.out.print("Choose your fries: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You ordered: Small Fries");
                        break;
                    case 2:
                        System.out.println("You ordered: Medium Fries");
                        break;
                    case 3:
                        System.out.println("You ordered: Large Fries");
                        break;
                    default:
                        System.out.println("Invalid fries choice!");
                }
                break;

            case 3:
                System.out.println("\n--- DRINKS MENU ---");
                System.out.println("1. Coke");
                System.out.println("2. Sprite");
                System.out.println("3. Iced Tea");
                System.out.print("Choose your drink: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("You ordered: Coke");
                        break;
                    case 2:
                        System.out.println("You ordered: Sprite");
                        break;
                    case 3:
                        System.out.println("You ordered: Iced Tea");
                        break;
                    default:
                        System.out.println("Invalid drink choice!");
                }
                break;

            default:
                System.out.println("Invalid category!");
        }

        input.close();
    }
}
