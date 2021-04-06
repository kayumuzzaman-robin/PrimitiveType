package learn.java;

/**
 * Primitive Type
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Primitive Type");
        int a = 10; // here 10 is a literal
        int b = a * a; // here this is an expression, not literal
 //       will cause error, need to cast to short as java by default cast to int &
//        int can't store in short

//        short c = a * a;
        short c = (short) (a * a);

        System.out.println("a = " + a + " & b = " + b + " & c = " + c);

    }
}
