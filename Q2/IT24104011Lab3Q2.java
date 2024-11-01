import java.util.Scanner;

public class IT24104011Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double monthlySalary = scanner.nextDouble();

        System.out.print("Enter number of OT hours: ");
        double otHours = scanner.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();

        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;

        System.out.println("OT Amount: " + otAmount);
        System.out.println("Total Salary: " + totalSalary);
        
        scanner.close();
    }
}
