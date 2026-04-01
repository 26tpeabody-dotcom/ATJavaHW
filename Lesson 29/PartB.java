//Teagan Peabody
//AT Java
//Lesson 26 Part B
public class PartB {
    public static void main(String[] args) {
        // Create an Employee and a Manager
        Employee employee = new Employee("Alice", 50000);
        Manager manager = new Manager("Bob", 70000, 15000);

        System.out.println(employee.getName() + "'s Annual Income: $" + employee.getAnnualIncome());
        System.out.println(manager.getName() + "'s Annual Income: $" + manager.getAnnualIncome());
    }
}

