package edu.alvernia.cs220.util;
import java.util.ArrayList;

public class MathUtilities {
    static public int summation(int[] b) {
        int summ = 0;
        int n = b.length;
        System.out.println(n);
                for(int i=0;i<n;i++)
        {
            summ+=b[i];

        }
        System.out.println("sum of "+n+" numbers is ="+summ);

        // TODO: Implement method per the comment above.
        return summ;
    }





    /**
     * Product is the process of finding the sum of a sequence of numbers.
     * In this method, we will take in an array of numbers, and using a
     * for loop, iterate over each number, and multiply it by the total.
     *
     * @param /numbers
     * @return total
     */
    static public int product(int[] b) {
        int product = 1;
        for (int i = 0; i < b.length; i++) {
            product *= b[i];
        }
        return product;
    }

    /**
     * Calculates the average of an array of floats, by adding
     * them together and dividing that total by the length of
     * the array.
     *
     * @param numbers An array of floats to find the average of.
     * @return The average of the input array of floats.
     */
    static public float average(float[] numbers) {
        float summ = 0;
        float n = numbers.length;
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            summ+= (float) numbers [i];

        }
        System.out.println("The average is: " + (summ/n));


        // TODO: Implement method per the comment above.
        return (summ / n);
    }

    /**
     * Determines whether a given integer is even or not. A
     * number is even if the number is divided by 2, and has
     * no remainder. The modulus (%) operator finds the
     * remainder of a division operation.
     *
     * @param number The integer to be checked.
     * @return True if the integer is even, false otherwise.
     */
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * Determines whether a given integer is odd or not. A
     * number is odd if the number is divided by 2, and has
     * a remainder of 1. The modulus (%) operator finds the
     * remainder of a division operation.
     *
     * @param number The integer to be checked.
     * @return True if the integer is even, false otherwise.
     */
    public static boolean isOdd(int number) {
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns the absolute value of a given number.
     *
     * @param number The number to find the absolute value of.
     * @return The absolute value of the given number.
     */
    public static int absoluteValue(int number) {
        if (number < 0) {
            return -number;
        } else {
            return number;
        }
    }
}
