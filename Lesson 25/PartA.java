//Teagan Peabody
//AT Java
//Lesson 25 Part A

//Given the public interface of the CashRegister class that specified in a previous slide, what is the output of the following code:
public static void main(String[] args) {
    CashRegister cr = new CashRegister();
    cr.addItem(3.00);
    cr.addItem(1.50);
    System.out.printf("Total = $%.2f%n", cr.getTotal());
    cr.clear();
    cr.addItem(2.00);
    cr.addItem(2.50);
    System.out.println("You have " + cr.getCount() + " items.");
    System.out.printf("Total = $%.2f%n", cr.getTotal());
}
//Output:
//Total = 4.50
//You have 2 items.
//Total = 4.50