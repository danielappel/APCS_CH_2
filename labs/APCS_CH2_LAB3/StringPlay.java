package labs.APCS_CH2_LAB3;

// **************************************************

import labs.*;
// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
   public static void main (String[] args)
   {
  	String college = new String ("PoDunk College");
 
        String town = "Anytown, USA"; // part (a)
 
  	int stringLength;
  	String change1, change2, change3;
 
        stringLength = college.length(); // part (b)
 
  	System.out.println (college + " contains " + stringLength + " characters.");
 
  	change1 = college.toUpperCase(); // part (c)
        System.out.println("Change 1: " + change1);
 
  	change2 = change1.replace("O", "*"); // part (d)
        System.out.println("Change 2: " + change2);
 
  	change3 = college.concat(town); // part (e)
        System.out.println("Change 3: " + change3);
 
  	System.out.println ("The final string is " + change3);
        
	}
}

