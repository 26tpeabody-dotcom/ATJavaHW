//Teagan Peabody
//AT Java
//Lesson 17 Part B

public class PartB {
    public static void main(String[] args) {
        int[][] firstArray = {
            {8, 6, 7},
            {5, 3, 0}
        };

        int[][] secondArray = {
            {0, 7, 6, 5},
            {2, 2, 0, 1},
            {8, 4, 5, 7}
        };

        System.out.println("First array:");
        print(firstArray);

        System.out.println("\nSecond array:");
        print(secondArray);
    }

    public static void print(int[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
                if (j < values[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}


