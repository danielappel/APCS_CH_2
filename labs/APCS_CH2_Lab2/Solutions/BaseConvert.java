package labs.APCS_CH2_Lab2.Solutions;


// ************************************************
//   BaseConvert.java
//
//   Converts base 10 numbers to another base
//   (at most 4 digits in the other base).  The
//   base 10 number and the base are input.
// ************************************************
import java.util.Scanner;
  
public class BaseConvert
{
   public static void main (String[] args)
   {
      int base;        // the new base
      int base10Num;   // the number in base 10
      int maxNumber;   // the maximum number that will fit
                       // in 4 digits in the new base
 
      int place0;      // digit in the 1's (base^0) place
      int place1;      // digit in the base^1 place
      int place2;      // digit in the base^2 place
      int place3;      // digit in the base^3 place
     
Scanner keyboard = new Scanner(System.in);

      String baseBNum = new String (""); // the number in the new base
 
      // read in the base 10 number and the base
      System.out.println();
      System.out.println ("Base Conversion Program");
      System.out.println();
      System.out.print ("Please enter a base (2 - 9): ");
      base = keyboard.nextInt();
 
      // Compute the maximum base 10 number that will fit in 4 digits
      // in the new base and tell the user what range the number they
      // want to convert must be in
 
      System.out.println ("Please enter a base 10 number to convert: ");
      base10Num = keyboard.nextInt();
      System.out.print("The number " + base10Num); 
    
 
      // Do the conversion (see notes in lab)
      
    // First compute place0 -- the units place.  Remember this comes
    // from the first division so it is the remainder when the
    // base 10 number is divided by the base (HINT %).
        place0 = base10Num % base;
    // Then compute the quotient (integer division / will do it!) -
    // You can either store the result back in base10Num or declare a
    // new variable for the quotient
        base10Num = base10Num / base;
 
    // Now compute place1 -- this is the remainder when the quotient
    // from the preceding step is divided by the base. 
        place1 = base10Num % base;
    // Then compute the new quotient
        base10Num = base10Num / base;
    // Repeat the idea from above to compute place2 and the next quotient
        place2 = base10Num % base;
        base10Num = base10Num / base;
 
    // Repeat again to compute place3
        place3 = base10Num % base;

      // Print the result (see notes in lab)
      baseBNum =  " is " + place3 + place2 + place1 + place0 + 
                         " in base " + base;
      System.out.println(baseBNum);
 
    }
}