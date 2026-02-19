import java.util.Scanner;

import java.util.ArrayList;

class CashRegister {
    private final ArrayList<Double> sales;

    public CashRegister() {
        this.sales = new ArrayList<>();
    }

    public void addItem(double price) {
        sales.add(price);
    }

    public int getCount() {
        return sales.size();
    }

    public double getTotal() {
        double total = 0.0;
        for (double price : sales) {
            total += price;
        }
        return total;
    }

    public void clear() {
        sales.clear();
    }

    public boolean deleteLast() {
        if (sales.isEmpty()) {
            return false;
        }
        sales.remove(sales.size() - 1);
        return true;
    }
}


public class PartB {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CashRegister register = new CashRegister();

		System.out.println("Enter a number to add a sale or 't' to show total and count, 'd' to delete the most recent sale, 'c' to clear sales, 'q' to quit.");
        while (true) {
			String input = scanner.next();

			if (input.equalsIgnoreCase("q")) {
				break;
			} else if (input.equalsIgnoreCase("t")) {
				System.out.printf("Total = $%.2f%n", register.getTotal());
				System.out.println("Item count = " + register.getCount());
			} else if (input.equalsIgnoreCase("d")) {
				boolean removed = register.deleteLast();
				if (!removed) {
					System.out.println("No sales to delete.");
				}
			} else if (input.equalsIgnoreCase("c")) {
				register.clear();
				System.out.println("Sales cleared.");
			} else {
				try {
					double price = Double.parseDouble(input);
					register.addItem(price);
				} catch (NumberFormatException e) {
					System.out.println("Invalid input.");
				}
			}
		}

		scanner.close();
	}
}
