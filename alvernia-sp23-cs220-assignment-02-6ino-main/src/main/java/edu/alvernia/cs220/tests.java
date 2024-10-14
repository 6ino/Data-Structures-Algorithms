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
//
//
//        int op;
//        op = letornum.nextInt();
//
//
//        int n;
//        int[] b;
//        float[] c;
//        int n1;
//        String[] b1;
//        String[] c1;
//
//        if (op == 1) {
//
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
//            System.out.println("How many strings would you like to work with?");
//            n1 = sc.nextInt();
//            b1 = new String[n1];
//            c1 = new String[n1];
//            System.out.println("enter the " + n + " numbers ");
//            for (int i = 0; i < n1; i++) {
//                System.out.println("enter  number  " + (i + 1) + ":");
//                b1[i] = sc.next();
//            }
//            for (int i = 0; i < n1; i++) {
//                c1[i] = String.valueOf(b1[i]);
//
//
//            }
//        }
//    }
//}