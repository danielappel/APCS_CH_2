package misc;

import java.util.Scanner;
    public class Questions
    {
          public static void main(String[ ] args)
          {
        int x, y, z;
        double average;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter an integer value");
        x = scan.nextInt( );
        System.out.println("Enter another integer value");
        y = scan.nextInt( );
        System.out.println("Enter a third integer value");
        z = scan.nextInt( );
        average = (x + y + z) / 3;
        System.out.println("The result of my calculation is " + average);
          }
    }
