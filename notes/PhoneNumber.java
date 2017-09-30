package notes;


/**
 * Write a description of class PhoneNumber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhoneNumber
{
    public static void main(String[] args) {
        int areaCode = createAreaCode();
        int threeDigits = createThree();
        int fourDigits = createFour();
        printPhoneNumber(areaCode, threeDigits, fourDigits);
    }
    
    public static int createAreaCode() {
        int areaCode = (int) (Math.random()*800);
        return areaCode;
    }
    
    public static int createThree() {
        int threeDigits= (int) (Math.random()*1000);
        return threeDigits;
    }
    
    public static int createFour() {
        int fourDigits= (int) (Math.random()*10000);
        return fourDigits;
    }
    
    public static void printPhoneNumber(int area, int three, int four) {
        
    }
}
