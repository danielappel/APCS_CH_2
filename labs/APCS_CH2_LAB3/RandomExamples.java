package labs.APCS_CH2_LAB3;
import java.util.Random;

/**
 * Write a description of class RandomExamples here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomExamples
{
    public static void main(String [] args) {
        Random generator = new Random();
        System.out.println(generator.nextInt());
        System.out.println(Math.abs(generator.nextInt() % 70));
        System.out.println(generator.nextInt(70));
    }
}
