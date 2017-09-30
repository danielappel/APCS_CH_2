package notes;

import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;


/**
 * Write a description of class CH2_Notes_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CH2_Notes_2
{
    public static void stringExamples() {
        //We can create a new string as follows:
        
        //With the 'new' keyword and constructor
        
        String title = new String("I will be a string object");
        
        //As a string literal (no 'new' operator)
        String title2;
        title2 = "I am a string literal";
        
        //We have various methods available
        
        //Character at a given index
        System.out.println("The character \"I\" occurs at index 0  using charAt(0) :" + title2.charAt(0));
        
        //The length of a string:
        System.out.println("The length of the string is using .length() :" + title2.length());
        
        //To create a substring:
        System.out.println("A portion of the string, is given with substring: " + title2.substring(5, title2.length()));
        
        //We can also replace characters
        System.out.println("replace(a, @) " + title2.replace("a", "@"));
        
        //You can also change the case
        System.out.println("toUpperCase()- " + title2.toUpperCase());
        
        
        
        System.out.println("title2 is now: " + title2);
        
        //System.out.println("NOTE:  THIS IS NOT CHANGING THE VALUE OF title2...WHY?");
        //Think about the return type on the methods.  You would need to do something like:  title2 = title2.toUpperCase();
        
    }
    
    public static void wrapperClasses() {
        //A wrapper class will turn a primative into an object.  Might be useful for passing objects as parameters
        
        //For Integers
        
        Integer myValue = new Integer(5);
        
        System.out.println(myValue + 6);  //Should give 11
        
        System.out.println(myValue.toString() + 6);  // will give 56
        
        //You can assign values to primatives using an Integer object
        
        int primativeInt;
        
        primativeInt = myValue;  //Example of autoboxing a value--Not on AP exam.
        
        System.out.println(primativeInt);
        
        //You can also test for equality or less than greater than
        System.out.println(myValue.compareTo(6));  //Since 5 is less than 6, returns -1
        System.out.println(myValue.equals(6));  //returns a boolean value
        
    }
    
    public static void usingClassLibraries() {
        //A class library may or may not need to be imported 
        //The Math class can be called anytime
        
        System.out.println(Math.pow(2.0, 3.0));  //raises 2 to the third power
        //Notice that Math.pow() is directly called without making an object---STATIC
        
        //The Random class is useful, but needs to be imported with import java.util.Random
        //You will have to make an instance of a Random object
        
        Random generator = new Random();
        int num1;
        double num2;
        
          num1 = generator.nextInt(10);  //Will start at 0 and go to 9
          System.out.println ("From 0 to 9: " + num1);
          num1 = generator.nextInt(10) + 1;  //Will start at 1 and go to 10;
          System.out.println ("From 1 to 10: " + num1);
          num1 = generator.nextInt(15) + 20; //Starts at 20, ends at 34
          System.out.println ("From 20 to 34: " + num1);
          num1 = generator.nextInt(20) - 10;
          System.out.println ("From -10 to 9: " + num1);
          num2 = generator.nextDouble();
          System.out.println ("A random double [between 0-1]: " + num2);
          num2 = generator.nextDouble() * 6;  // 0.0 to 5.999999
          num1 = (int) num2 + 1; //will cast the double to an int and then add 1
          System.out.println ("From 1 to 6: " + num1);
        
    }
    
    public static void usingScanners() {
        //You can get input from a user using the scanner class:
        //This must be imported with java.util.Scanner;
        Scanner myScanner = new Scanner(System.in);
        
        //Start with print statement
        System.out.println("Enter an integer: ");
        myScanner.nextInt(); //This will crash the VM in BlueJ (not netBeans)
        
        System.out.println("What is your name? ");
        
        String name = myScanner.nextLine();
        System.out.println("Hello there " + name);
        
        System.out.println("Anyone else? ");
        String name2 = myScanner.next();
        System.out.println("Hello there " + name2);  //Try Joe Appel--will stop at first space

    }
    
    public static void formattingNumbers() {
        //We can also format a number as currency or percents
        //import with java.text.NumberFormat;
        NumberFormat money = NumberFormat.getCurrencyInstance();  //Do NOT need a new operator (talk about later)
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        System.out.println("Formatting $45.35 as a number: " + money.format(45.35));
        System.out.println("Formatting 65% as a number: " + percent.format(0.65));
        
        //We can also look at decimals---not super imortant.
        
    }
}
