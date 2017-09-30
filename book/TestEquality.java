package book;


/**
 * Demonstrates differences between various equality-related Java features.
 * 
 * @author William Goldie 
 * @version 0.0.1
 */
public abstract class TestEquality
{
   public static void main(String[] args) {
       String a = "oh no!";
       String b = "oh no!";
       System.out.println("Two strings defined with string literals point to the same object:\n");
       test(a,b);
       System.out.println("Two strings defined with new operators point to different objects:\n");
       String c = new String("oh no!");
       String d = new String("oh no!");
       test(c,d);
   }
    
   public static void test(String a, String b){
       // The == operator tests to see if two object references point to the same object.
       // If two objects have the same contents, but do not point to the same place in memory, they will not return true with the == operator.
       System.out.println("(a == b) => " + (a == b));
       System.out.println("(a.equals(b)) => " + a.equals(b));
       System.out.print("\n");
       
       // The .equals() function tests to see if two objects have the same contents.
       // If two objects have the same contents, or are the same object, the .equals() function will return true.
       // Custom objects often implement their own .equals() override methods.
       System.out.println("a => \"" + a + "\"");
       System.out.println("b => \"" + b + "\"");
       System.out.print("\n");
       
       // A hashcode is a unique identifier for the contents of an object.
       // Two objects that return true with the a.equals(b) function should have equivalent hashcodes.
       // Custom objects often implement their own .hashCode() override methods.
       System.out.println("identityHashCode a => " + a.hashCode());
       System.out.println("identityHashCode b => " + b.hashCode());
       System.out.println("identityHashCode a == identityHashCode b => " + (a.hashCode() ==  b.hashCode()));
       System.out.print("\n");
       
       // An identity hashcode is a unique identifier for a specific object in memory.
       // Two objects that return true with the == operator should have equivalent identity hashcodes.
       System.out.println("identityHashCode a => " + System.identityHashCode(a));
       System.out.println("identityHashCode b => " + System.identityHashCode(b));
       System.out.println("identityHashCode a == identityHashCode b => " + (System.identityHashCode(a) == System.identityHashCode(b)));
       System.out.print("\n");
   }
}
