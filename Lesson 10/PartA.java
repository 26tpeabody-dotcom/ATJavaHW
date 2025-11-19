//Teagan Peabody
//AT Java
//Lesson 10 Part A

public class PartA {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println("The last letter of the name is " +
            name.charAt(name.length() - 1));
    }
}
// The original code had a compile-time error because the method charAt was called with an invalid index (name.length() which is out of bounds).