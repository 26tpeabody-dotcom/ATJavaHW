//Teagan Peabody
//AT Java
//Lesson 22 Part B

//What is the output of the following code and why?

public class PartB {
    public static void main(String[] args) {
        System.out.println(test());
    }

    public static int test() {
        try {
            return 1;
        } finally {
            return 3;
        }
    }
}

//The output of the code will be 3. This is because the finally block is executed after the try block, regardless of whether an exception was thrown or not. In this case, the try block returns 1, but before that return value can be used, the finally block executes and returns 3, which overrides the previous return value. Therefore, the final output is 3.

