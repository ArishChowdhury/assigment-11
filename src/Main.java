
import java.util.Scanner;
public class Main {
    public static int factorial(int number){
        //if number is 4 multiply 4 with all whole numbers smaller than 4 then add it with the next smallest number and continue it till it reaches 1l
        int multiply = 1;
        for (int counter = 1; counter <= number; counter++){
            multiply = multiply*counter;

        }
        return number;
    }
    public static void main(String[] args){
        Scanner ss = new Scanner(System.in);
        //Step 1 make variable to take number of numbers
        int number;
        //Step 2 Take the input from the user
        System.out.println("Please enter the number : ");
        number = ss.nextInt();
        //Step 3 Make a variable to store sum of number
        int sum = 0;

        // Step 3 Put the variable number to count the numbers and add it
        for (int counter = 1; counter <= number; counter++){
            sum = factorial(sum) + factorial(counter);
        }

        System.out.println("The sum of the factorial is "+sum);



    }
}