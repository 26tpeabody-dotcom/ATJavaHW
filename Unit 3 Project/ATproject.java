//Teagan Peabody
//AT Java HW Unit 3 Project
import java.util.Scanner;
public class ATproject {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    enum CustomerType {
        BABY, CHILD, ADULT, SENIOR
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter day of the week: ");
        String dayInput = scanner.nextLine().toUpperCase();
        Day day;

        System.out.print("Enter time (HH:MM): ");
        String timeInput = scanner.nextLine();
        String[] timeParts = timeInput.split(":");
        if (timeParts.length < 2) {
            return;
        }
        dayInput = getFullDayName(dayInput);
        if (dayInput == null) {
            System.out.println("Invalid day of the week.");
            return;
        } else {
            day = Day.valueOf(dayInput);
        }
        int hour = Integer.parseInt(timeParts[0]);
        int minute = Integer.parseInt(timeParts[1]);
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Invalid time.");
            return;
        }

        System.out.print("Enter age: ");
        String ageInput = scanner.nextLine();
        if (ageInput == null || ageInput.isEmpty()) {
            System.out.println("Invalid age.");
            return;
        }
        int age = Integer.parseInt(ageInput);
        if (age < 0) {
            System.out.println("Age cannot be negative.");
            return;
        }

        System.out.print("Are you a student? (true/false): ");
        String studentInput = scanner.nextLine();
        boolean isStudent;
        if (studentInput.equalsIgnoreCase("true")) {
            isStudent = true;
        } else if (studentInput.equalsIgnoreCase("false")) {
            isStudent = false;
        } else {
            System.out.println("Invalid input for student status.");
            return;
        }

        // Determine customer type
        CustomerType customerType;
        if (age <= 2) {
            customerType = CustomerType.BABY;
        } else if (age <= 12) {
            customerType = CustomerType.CHILD;
        } else if (age <= 59) {
            customerType = CustomerType.ADULT;
        } else {
            customerType = CustomerType.SENIOR;
        }   
        // Calculate base price
        double basePrice;
        if (day == Day.SATURDAY || day == Day.SUNDAY) {
            basePrice = 80.00;
        } else {
            if ((hour >= 6 && hour < 8) || (hour >= 16 && hour < 18)) {
                basePrice = 100.00;
            } else {
                basePrice = 90.00;
            }
        }   
        // Calculate discounts
        double ageDiscount = 0.0;
        if (customerType == CustomerType.BABY) {
            basePrice = 0.0;
        } else if (customerType == CustomerType.CHILD) {
            ageDiscount = 0.20 * basePrice;
        } else if (customerType == CustomerType.SENIOR) {   
            ageDiscount = 0.25 * basePrice;
        }
        double priceAfterAgeDiscount = basePrice - ageDiscount;
        double studentDiscount = 0.0;
        if (isStudent && customerType != CustomerType.BABY) {
            studentDiscount = 0.05 * priceAfterAgeDiscount;
        }
        double finalPrice = priceAfterAgeDiscount - studentDiscount;    
    // Print receipt
    
        System.out.println("\n--------------------------------------------");
        System.out.printf("Name:             %s%n", name);
        System.out.printf("Day:              %s%n", day);
        System.out.printf("Time:             %02d:%02d%n", hour, minute);
        System.out.println("--------------------------------------------");
        System.out.printf("Base Price:       $  %.2f%n", basePrice);
        System.out.printf("Age Discount:     $ -%.2f%n", ageDiscount);
        System.out.printf("Student Discount: $ -%.2f%n", studentDiscount);
        System.out.println("--------------------------------------------");
        System.out.printf("Final Price:      $  %.2f%n", finalPrice);
        System.out.println("--------------------------------------------");

        scanner.close();
    }   
    private static String getFullDayName(String abbrev) {
        if (abbrev == null) return null;
        String a = abbrev.toUpperCase();
        switch (a) {
            case "MON":
            case "MONDAY":
                return "MONDAY";
            case "TUE":
            case "TUES":
            case "TUESDAY":
                return "TUESDAY";
            case "WED":
            case "WEDNESDAY":
                return "WEDNESDAY";
            case "THU":
            case "THUR":
            case "THURSDAY":
                return "THURSDAY";
            case "FRI":
            case "FRIDAY":
                return "FRIDAY";
            case "SAT":
            case "SATURDAY":
                return "SATURDAY";
            case "SUN":
            case "SUNDAY":
                return "SUNDAY";
            default:
                return null;
        }
    }

    // Validate that hour and minute strings represent a valid time (HH and MM)
    private static boolean isValidTime(String hourStr, String minuteStr) {
        if (hourStr == null || minuteStr == null) {
            System.out.println("Invalid time format.");
            return false;
        }
        if (hourStr.isEmpty() || minuteStr.isEmpty()) {
            System.out.println("Invalid time format.");
            return false;
        }
        if (!isNumeric(hourStr) || !isNumeric(minuteStr)) {
            System.out.println("Invalid time format.");
            return false;
        }
        int h = Integer.parseInt(hourStr);
        int m = Integer.parseInt(minuteStr);
        if (h < 0 || h > 23 || m < 0 || m > 59) {
            System.out.println("Invalid time.");
            return false;
        }
        return true;
    }

    private static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}

// Test Cases: 
//1. Input: Name: Teagan Peabody, Day: Monday, Time: 07:30, Age: 25, Student: true
   //Expected Output: Base Price: $100.00, Age Discount: $0.00, Student Discount: $5.00, Final Price: $95.00
//2. Input: Name: Teagan Peabody, Day: Saturday, Time: 10:00, Age: 8, Student: false
   //Expected Output: Base Price: $80.00, Age Discount: $16.00, Student Discount: $0.00, Final Price: $64.00
//3. Input: Name: Baby Teagan, Day: Sunday, Time: 12:00, Age: 1, Student: false
  // Expected Output: Base Price: $0.00, Age Discount: $0.00, Student Discount: $0.00, Final Price: $0.00
//4. Input: Name: Senior Teagan, Day: Wednesday, Time: 17:00, Age: 65, Student: true
  // Expected Output: Base Price: $100.00, Age Discount: $25.00, Student Discount: $3.75, Final Price: $71.25
//5. Input: Name: Invalid Day, Day: Funday, Time: 09:00, Age: 30, Student: false
  // Expected Output: "Invalid day of the week."
//6. Input: Name: Invalid Time, Day: Tuesday, Time: 25:00, Age: 30, Student: false
   //Expected Output: "Invalid time."
//7. Input: Name: Negative Age, Day: Thursday, Time: 14:00, Age: -5, Student: false
   // Expected Output: "Age cannot be negative."