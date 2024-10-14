//package edu.alvernia.cs220;
//import java.util.Scanner;
//
//import static edu.alvernia.cs220.util.MathUtilities.*;
//
//public class Main {
//
//    public static void main(String arg[]) {
//
//
//        Scanner letornum = new Scanner(System.in); // Scanner object lettornum determines which input to scan for
//
//        System.out.println("Select an option:\n1.) Numbers \n2.) Letters");
//        int op;
//        op = letornum.nextInt();
//
//        if (op == 1) {
//
//
//            int n;
//            int[] b;
//            float[] c;
//
//
//            Scanner sc = new Scanner(System.in);
//            Scanner sc1 = new Scanner(System.in);
//            System.out.println("How many numbers would you like to work with?");
//            n = sc.nextInt();
//            b = new int[n];
//            c = new float[n];
//            System.out.println("enter the " + n + " numbers ");
//            for (int i = 0; i < n; i++) {
//                System.out.println("enter  number  " + (i + 1) + ":");
//                b[i] = sc.nextInt();
//            }
//            for (int i = 0; i < n; i++) {
//                c[i] = (float) b[i];
//            }
//
//
//
//
//
//            System.out.println("Select an Option!: \n1.) Sum\n2.) Product\n3.) Average\n4.) Check Odd/even");
//
//            Scanner numbs = new Scanner(System.in);
//            System.out.println("");
//            //I can make if else statement to prompt these
//            // System.out.println("product of  numbers is"+ product(b));
//
////               (numbers = new float[]{20, 20, 20, 20, 20};);
//
//
//
//            average(c);
////        for(int i=0;i<n;i++)
////        {
////            sum+=a[i];
////        }
//
//        }
//    }
//}
