package homework;
import java.util.Scanner;

/**
 * Write a description of class Homework2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Homework2
{
    public static void main(String[] args) {
        
        int a =5, b = 5;
        double x = 5.0, y = 4.0;
        
        System.out.println((int) x / y);
        System.out.println(a/b);
        System.out.println(a % b);
    }
    
    public static void checkInput() {
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.println("Enter a number: ");
        x = scan.nextInt();
        System.out.println("You have entered: " + x);
    }
}
