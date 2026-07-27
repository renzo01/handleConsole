import java.util.Scanner;

public class EmployeeSystem {
    public static void main(String[] args) {
        System.out.println("Welcome to the Employee Management System!");

        var console = new Scanner(System.in);
        System.out.println("Please enter the employee's name: ");
        var name = String.valueOf(console.nextLine());
        System.out.println("Please enter the employee's age: ");
        var age = Integer.parseInt(console.nextLine());
        System.out.println("Please enter the income of the employee: ");
        var income = Double.parseDouble(console.nextLine());
        System.out.println("Please enter the employee's Department Manager: ");
        var manager = String.valueOf(console.nextLine());
        console.close();

        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Income: " + income);
        System.out.println("Department Manager: " + manager);
    }
}
