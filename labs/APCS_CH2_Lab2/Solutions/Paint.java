package labs.APCS_CH2_Lab2.Solutions;


//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
    public static void main(String[] args)
    {
        final int COVERAGE = 350;  //paint covers 350 sq ft/gal
        //declare integers length, width, and height;
        int length, width, height;
        //declare double totalSqFt;
        double totalSqft;
        //declare double paintNeeded;
        double paintNeeded;
 
        //Declare and initialize the length of the room
        length = 15;
        //Declare and initialize the width of the room
        width = 11;
        //Declare and initialize the height of the room
        height = 8;
        //Compute the total square feet to be painted--think
        //about the dimensions of each wall
        int wallLength = length * height;
        int wallWidth = width * height;
        int ceiling = length * width;
        
        totalSqft = 2 * (wallLength + wallWidth) + ceiling;
 
        //Compute the amount of paint needed
        paintNeeded = totalSqft/COVERAGE;
 
        //Print the length, width, and height of the room and the
        //number of gallons of paint needed.
        System.out.println("You need to paint " + totalSqft + " square feet.");
        System.out.println("You will need " + paintNeeded + " gallons of paint for a room " +
            length + " long " + width + " wide, and " + height + " tall.");
        
        System.out.println("You should probably get " + ((int) paintNeeded + 1) + " gallons of paint.");
    }
}
