package java;

public class SwitchStatement {
    public static void main(String[] args) {
        int choice = 3;

switch (choice) {
    case 1:
        System.out.println("Pizza");
        break;
    case 2:
        System.out.println("Burger");
        break;
    case 3:
        System.out.println("Fries");
        break;
    case 4:
        System.out.println("Hotdog");
        break;
    default:
        System.out.println("Walang napiling pagkain.");
}

    }
}

