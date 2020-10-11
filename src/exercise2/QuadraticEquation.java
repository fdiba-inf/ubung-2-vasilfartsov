package exercise2;

import java.util.Scanner;

public class QuadraticEquation {

  public static void main(String[]args){

    Scanner input = new Scanner(System.in);
    System.out.println("Value for a");
    double a = input.nextDouble();
    System.out.println("Value for b:");
    double b = input.nextDouble();
    System.out.println("Value for c:");
    double c = input.nextDouble();
    if (a != 0) {
      double disc = Math.pow(b, 2) - 4*a*c;
      if (disc >= 0) {
        double answer1 = (-b + Math.sqrt(disc)) / (2*a);
        double answer2 = (-b - Math.sqrt(disc)) / (2*a);
        System.out.println("x1 = " + answer1);
        System.out.println("x2 = " + answer2);
      }
      else {
          System.out.println("Imaginary values");
        }
    }
    else if (b != 0) {
      double answer = -c/b;
      System.out.println("x = " + answer);
    }
    else if (b == 0 || c != 0) {
      System.out.println("No values");
    }
         else if (b == 0 || c == 0) {
      System.out.println("Many values");
    }
  }
}