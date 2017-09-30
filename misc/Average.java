package misc;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 3 integer values, pressing enter after each one");
        int x = scan.nextInt( );
        int y = scan.nextInt( );
        int z = scan.nextInt( );
        double avg = ((double) x + y + z) / 3;
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("The average of these values is " + df.format(avg));
    }

 }
