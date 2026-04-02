//What is the output of the following code and why?

   public static void main(String[] args) {
       Customer.lastSerialUsed = 100;
       Customer c1 = new Customer("Sal's Deli");
       c1.addSale(100);
       Customer c2 = c1;
       c2.addSale(50);
       System.out.println(c1.getSales());
       System.out.println(c2.getSales());
   }
//The output of the code will be:
//150.0
//150.0
//This is because both c1 and c2 are references to the same Customer object in memory. When we create c1, it points to a Customer object with the name "Sal's Deli" and sales of 0.0. When we assign c2 = c1, we are not creating a new Customer object, but rather making c2 point to the same object that c1 points to. Therefore, when we call c2.addSale(50), it adds 50 to the sales of the same Customer object that c1 points to. As a result, both c1.getSales() and c2.getSales() will return the same value of 150.0, which is the total sales for that Customer object.

//Use the Customer class that we discussed during our lesson. Fill in the parts of the class that are missing from what we discussed during the lesson.
class Customer {
    private String name;
    private double sales;
    public static int lastSerialUsed;

    public Customer(String name) {
        this.name = name;
        this.sales = 0.0;
        lastSerialUsed++;
    }

    public void addSale(double amount) {
        this.sales += amount;
    }

    public double getSales() {
        return this.sales;
    }

    public static int getLastSerialUsed() {
        return lastSerialUsed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}


