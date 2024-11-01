import java.util.Scanner;

public class IT24104011Lab3Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a five-digit number: ");
        int number = scanner.nextInt();
        
        // Ensure the number is five digits
        if (number >= 10000 && number <= 99999) {
            String numberStr = Integer.toString(number);
            
            System.out.print("Separated digits: ");
            for (int i = 0; i < numberStr.length(); i++) {
                System.out.print(numberStr.charAt(i) + " ");
            }
        } else {
            System.out.println("Please enter a valid five-digit number.");
        }
        
        scanner.close();
    }
}
