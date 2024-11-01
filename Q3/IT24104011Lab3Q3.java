import java.util.Scanner;

public class IT24104011Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int amount = scanner.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] counts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            counts[i] = amount / denominations[i];
            amount = amount % denominations[i];
        }

        System.out.println("Denominations breakdown:");
        for (int i = 0; i < denominations.length; i++) {
            if (counts[i] != 0) {
                System.out.println(denominations[i] + "/= : " + counts[i]);
            }
        }

        scanner.close();
    }
}
