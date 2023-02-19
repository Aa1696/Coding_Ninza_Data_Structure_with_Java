package Exception_Handling;
import java.util.*;
public class Exception extends java.lang.Exception {
    static void fun() throws Exception
    {
        throw new Exception();
    }
    public static void main(String args[])
    {
        try{
            int a = 5/0;
        } catch(ArithmeticException e){
            System.out.print("Arithmetic Exception caught ");
        }
        finally{
            System.out.print("finally block");
        }
//        try {
//            fun();
//        }
//        catch (Exception e) {
//            System.out.print("caught in main.");
//        }
//        System.out.print("All is well");
    }
}