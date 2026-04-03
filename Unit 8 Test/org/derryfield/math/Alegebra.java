//Teagan Peabody
//AT Java
//Unit 8 Test

package org.derryfield.math;

public class Alegebra {

    public static double harmonicMean(double x, double y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Both values must be positive.");
        }
        if (x < 0 && y < 0) {
            throw new IllegalArgumentException("Both values must be positive.");
        }

        double sum = x + y;
        if (sum == 0) {
            throw new IllegalArgumentException("The sum of x and y must not be zero.");
        }

        return (2 * x * y) / sum;
    }
}
