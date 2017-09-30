package book;

public class AndOrPrecedence{
    public static int a() {
        System.out.println("a is evaluated");
        return 10;
    }
    public static int b() {
        System.out.println("b is evaluated");
        return 20;
    }
    public static int c() {
        System.out.println("c is evaluated");
        return 20;
    }
        
    public static void main (String [] args){
        System.out.println("a = " + a() + "  b = " + b() + "  c = " + c() );
        System.out.println("(a == b) && (a == c) || (b == c) is " + ((a() == b()) && (a() == c()) || (b() == c())));
        System.out.println("(a == a) || (a == c) && (b == c) is " + ((a() == a()) || (a() == c()) && (b() == c())));
        System.out.println("(c == b) || (a == c) && (a == c) is " + ((c() == b()) || (a() == c()) && (a() == c())));
        System.out.println("(c == b) || (a == b) && (a == c) is " + ((c() == b()) || (a() == b()) && (a() == c())));
        System.out.println("(c == b) && (a == c) || (a == c) is " + ((c() == b()) && (a() == c()) || (a() == c())));
        System.out.println("(a == b) || (a == c) && (a == c) is " + ((a() == b()) || (a() == c()) && (a() == c())));
    }
}
