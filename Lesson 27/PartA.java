//Teagan Peabody
//AT Java
//Lesson 27 Part A

//The LocalDate and LocalTime classes are part of the java.time package, which is a subpackage of the java package.
import java.time.LocalDate;
import java.time.LocalTime;

public class PartA {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        System.out.println("Today's date is " + currentDate);
        System.out.println("The time is " + currentTime);
    }
}