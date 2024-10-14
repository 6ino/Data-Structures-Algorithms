package edu.alvernia.cs220;
import java.util.Scanner;

import static edu.alvernia.cs220.util.MathUtilities.*;
import static edu.alvernia.cs220.util.StringUtilities.*;

public class Main {

    public static void main(String arg[]) {


        Scanner letornum = new Scanner(System.in); // Scanner object lettornum determines which input to scan for
        System.out.println("Welcome to the Math and String Utility program by: Gino Giacolona");
            int x = 0;
            while (x < 10) {
        System.out.println("Select an option below!\n1.) Numbers \n2.) Letters");
        int output1;
        output1 = letornum.nextInt();


            if (output1 == 1) { //selects numbers over string
                Scanner numes = new Scanner(System.in);
                System.out.println("Select an option to perform below!\n______________________________________\n1.)Summation\n2.)Product\n3.)Average\n4.)Check if even\n5.)Check if odd\n6.)Absolute Value\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n7.) back\n8.) Exit");
                int oneops;
                oneops = numes.nextInt();

                if (oneops == 1) {
                    int n;
                    int[] b;
                    float[] c;
                    int n1;
                    String[] b1;
                    String[] c1;
                    Scanner sc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("How many numbers would you like to work with?");
                    n = sc.nextInt();
                    b = new int[n];
                    c = new float[n];
                    System.out.println("enter the " + n + " numbers ");
                    for (int i = 0; i < n; i++) {
                        System.out.println("enter  number  " + (i + 1) + ":");
                        b[i] = sc.nextInt();

                        summation(b);
                    }

                } else if (oneops == 2) {


                    int n;
                    int[] b;
                    float[] c;
                    int n1;
                    String[] b1;
                    String[] c1;
                    Scanner sc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("How many numbers would you like to work with?");
                    n = sc.nextInt();
                    b = new int[n];
                    c = new float[n];
                    System.out.println("Enter the " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter number " + (i + 1) + ":");
                        b[i] = sc.nextInt();
                    }

                    int result = product(b);
                    System.out.println("The product of the numbers is: " + result);


                } else if (oneops == 3) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter numbers to calculate the average:");
                    int n = sc.nextInt();
                    float[] numbers = new float[n];
                    System.out.println("Enter the " + n + " numbers:");
                    for (int i = 0; i < n; i++) {
                        System.out.println("Enter number " + (i + 1) + ":");
                        numbers[i] = sc.nextFloat();
                    }
                    average(numbers);


                } else if (oneops == 4) {
                    Scanner sc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter a number to check if even:");
                    int number = sc.nextInt();
                    boolean result = isEven(number);
                    System.out.println(result);


                } else if (oneops == 5) {
                    Scanner sc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter a number to check if odd:");
                    int number = sc.nextInt();
                    boolean result = isOdd(number);
                    System.out.println(result);


                } else if (oneops == 6) {
                    Scanner sc = new Scanner(System.in);
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Enter a number to find its absolute value");
                    int number = sc.nextInt();
                    int result = absoluteValue(number);
                    System.out.println(result);


                } else if (oneops == 7) {
                    System.out.println("Sorry this function doesn't work yet still working on it");

                } else if (oneops == 8) {
                    System.out.println("Thank you for using the program!");
                    System.exit(0);

                } else {
                    System.out.println("Please select a valid option");

                } //end of oneops elseif


            } else if (output1 == 2) {
                Scanner dumes = new Scanner(System.in);
                System.out.println("Select an option to perform below!\n______________________________________\n1.)Count Letters\n2.)Reverse String\n3.)Invert Case\n4.)Trim\n5.)Check if palidrome\n6.)Pad Left\n7.)Pad Right\n8.)Convert to Number\n9.)End function\n10.)Start function\n=-=-=-=-=-=-=-=-=-=-=-=-=-=\n11.) back\n12.) Exit");
                int twoops;
                twoops = dumes.nextInt();

                if (twoops == 1) {
                    //count letters
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter string: ");
                    String stringToSearch = sc.nextLine();
                    System.out.print("Enter a letter would you like to count: ");
                    char letterToCount = sc.next().charAt(0);
                    int count = countLetters(stringToSearch, letterToCount);
                    System.out.println("Number of '" + letterToCount + "'s in '" + stringToSearch + "': " + count);


                } else if (twoops == 2) {
                    //reverse string
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String stringToReverse = sc.nextLine();
                    String reversedString = reverse(stringToReverse);
                    System.out.println("Reversed string: " + reversedString);



                } else if (twoops == 3) {
                    //invert case
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String stringToInvert = sc.nextLine();
                    String invertedString = invertCase(stringToInvert);
                    System.out.println("Inverted case: " + invertedString);


                } else if (twoops == 4) {
                    //Trim not working




                } else if (twoops == 5) {
                    //check if palidrome
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String s = sc.nextLine();
                    boolean result = isPalindrome(s);
                    if (result) {
                        System.out.println("The string is a palindrome.");
                    } else {
                        System.out.println("The string is not a palindrome.");
                    }



                } else if (twoops == 6) {
                    //padleft
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the string to pad: ");
                    String str = sc.nextLine();
                    System.out.print("Enter the character to pad with: ");
                    char toPadWith = sc.nextLine().charAt(0);
                    System.out.print("Enter the number of characters to pad: ");
                    int numberToPad = sc.nextInt();
                    String paddedString = padLeft(str, toPadWith, numberToPad);
                    System.out.println("The padded string is: " + paddedString);



                } else if (twoops == 7) {
                    //pad right
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String str = sc.nextLine();
                    System.out.print("Enter the character to pad with: ");
                    char toPadWith = sc.nextLine().charAt(0);
                    System.out.print("Enter the number of characters to pad: ");
                    int numberToPad = sc.nextInt();
                    String paddedString = padLeft(str, toPadWith, numberToPad);
                    System.out.println("The padded string is: " + paddedString);

                } else if (twoops == 8) {
                    //Check if number
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a string to check if it's a number: ");
                    String str = sc.nextLine();
                    System.out.println("The result of the check is: " + isNumber(str));


                } else if (twoops == 9) {
                    // Converts number of characters to number
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String str = scanner.nextLine();
                    System.out.print("Enter the number of characters: ");
                    int numberOfCharacters = scanner.nextInt();

                    String result = end(str, numberOfCharacters);
                    System.out.println("Result: " + result);


                } else if (twoops == 10) {
                    //Pass string return first number of characters
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    String str = scan.nextLine();
                    System.out.print("Enter the number of characters to start with: ");
                    int numberOfCharacters = scan.nextInt();
                    System.out.println("The starting string is: " + start(str, numberOfCharacters));
                    scan.close();



                } else if (twoops == 11) {
                    System.out.println("Thank you for using the program!");
                    System.exit(0);


                } else if (twoops ==12){

                    System.out.println("Sorry this feature is not available");

                }


                //end of twoops elseif 11 is exit

            } else {
                System.out.println("Please select a valid option!");

            }


        }
    }
}