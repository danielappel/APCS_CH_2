package labs.APCS_CH2_LAB3;

import java.util.Scanner;
/**
 * Write a description of class ExtraCredit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExtraCredit
{
    public static void main (String[] args) {
        firstMethod();
        secondMethod();
    }
    
    public static void firstMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Anyone else?");
        name = scan.nextLine();
        System.out.println("Hello " + name);
    }
    
    public static void secondMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name);
        System.out.println("Anyone else?");
        name = scan.next();
        System.out.println("Hello " + name);
    }
}
