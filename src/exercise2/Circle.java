package exercise2;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int r = input.nextInt();

        System.out.println("Circumference: " + 2*Math.PI*r);
        System.out.println("Area: " +Math.PI*Math.pow(r,2));
    }

}
