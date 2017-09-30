package labs.APCS_CH2_LAB3;

import java.util.Random;


public class Dice {

   
    public static void main(String[] args) {
        int firstRoll, secondRoll;
        
        Random generator = new Random();
        
        firstRoll = generator.nextInt(5) + 1;
        secondRoll = generator.nextInt(5) + 1;
        
        rollResult(firstRoll);
        rollResult(secondRoll);
        rollTotal(firstRoll, secondRoll);   
    }
    
    public static void rollResult(int roll) {
        System.out.println("Your first roll is a " + roll);
    }
    
    public static void rollTotal(int first, int second) {
        System.out.println("You have rolled a total of " + (first + second));
    }

}