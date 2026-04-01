//Teagan Peabody
//AT Java
//Lesson 26 Part A

public class PartA {
    public static void main(String[] args) {
        Bicycle regularBike = new Bicycle();
        GearedBicycle gearedBike = new GearedBicycle();

        for (int i = 0; i < 10; i++) {
            regularBike.pedal();
            gearedBike.pedal();
        }

        System.out.println("Regular Bicycle Speed before braking: " + regularBike.getSpeed());
        System.out.println("Geared Bicycle Speed before braking: " + gearedBike.getSpeed());

        for (int i = 0; i < 5; i++) {
            regularBike.brake();
            gearedBike.brake();
        }

        System.out.println("Regular Bicycle Speed after braking: " + regularBike.getSpeed());
        System.out.println("Geared Bicycle Speed after braking: " + gearedBike.getSpeed());
    }
}