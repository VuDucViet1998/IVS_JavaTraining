package day2.assignment1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int b = sc.nextInt();
        sc.close();
        Area a = new Area(l, b);
        System.out.println("The area of the rectangle is: " + a.returnArea());
    }
}