import java.util.Scanner;

public class IT24104011Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();

        double totalPrice = pricePerKg * numberOfKg;
        double discount = totalPrice * 0.10;
        double finalPrice = totalPrice - discount;

        System.out.println("The total amount you have to pay after discount is: " + finalPrice);
    }
}
