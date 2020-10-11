package exercise2;

import java.util.Scanner;

public class SumOfDigits{

  public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.println("eine Zahl zwischen 0 und 999 ");
    
    int number=input.nextInt();
    int d1=number%10;
    number=number/10;
    int d2=number%10;
    number=number/10;
    int d3=number%10;
    System.out.println("Sum of digits: " + (d1+d2+d3));


  }
}