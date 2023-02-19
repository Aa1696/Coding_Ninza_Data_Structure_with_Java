package Stack;
import java.util.*;
public class Stack_Basics {
    public static void main(String[] args){
        Stack<Integer> stack=new Stack<Integer>();
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.print(stack.pop()+stack.size());
    }
}
