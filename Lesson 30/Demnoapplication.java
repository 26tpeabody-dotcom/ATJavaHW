//Teagan Peabody
//AT Java
//Lesson 30

import java.util.ArrayList;
import java.util.Scanner;

public class Demnoapplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        while (true) {
            System.out.print("Enter a letter ((E)mployee, (M)anager, E(X)ecutive, or (Q)uit): ");
            String choice = in.nextLine().toLowerCase();
            String name;
            double salary;
            double bonus;
            double shares;
            if (choice.equals("q")) {
                break;
            } else if (choice.equals("e")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                Employee employee = new Employee(name, salary);

                employees.add(employee);
            } else if (choice.equals("m")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                Manager manager = new Manager(name, salary, bonus);


                employees.add(manager);
            } else if (choice.equals("x")) {
                System.out.print("Enter name: ");
                name = in.nextLine();
                System.out.print("Enter salary (as a double): ");
                salary = Double.parseDouble(in.nextLine());
                System.out.print("Enter bonus (as a double): ");
                bonus = Double.parseDouble(in.nextLine());
                System.out.print("Enter shares owned (as a double): ");
                shares = Double.parseDouble(in.nextLine());
                Executive executive = new Executive(name, salary, bonus, shares);

                employees.add(executive);
            } else {
                System.out.println("I don't understand your choice.");
            }
            System.out.println();

        }
       
        System.out.println();
        System.out.printf("Your company has %d employees.%n", employees.size());
        System.out.println();

        for (Employee employee : employees) {
            employee.displayInfo();
            System.out.println();

        in.close();
        }
    }
}