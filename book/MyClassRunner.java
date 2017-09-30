package book;


/**
 * Write a description of class MyClassRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyClassRunner
{
    public static void main (String[] args) {
        MyClass myName = new MyClass();
        
        int myOutput = myName.sampleMethod(3);
        
        System.out.println(myOutput);
        //System.out.println(myName.z);  //will produce an error.
    }
}
