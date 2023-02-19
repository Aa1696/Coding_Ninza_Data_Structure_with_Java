package Stack;

public class Implementing_of_Stack {
    private int []arr;
    private int top_index;
    Implementing_of_Stack(){
        arr=new int[10];
        top_index=-1;
    }
    public boolean isEmpty(){
        if(top_index==-1){
            return false;
        }
        return true;
    }
    public void push(int data) throws StackFullException {
        //Stack full Exception
        if(top_index==arr.length-1){
                StackFullException er=new StackFullException();
                throw er;
                //throw new StackFullException
        }
        top_index++;
        arr[top_index]=data;
    }
    public int pop() throws StackEmptyException {
        if(top_index==-1){
            throw new StackEmptyException();
        }
        int tmp=arr[top_index];
        top_index--;
        return tmp;
    }
    public int peek() throws StackEmptyException {
        if(top_index==-1){
            throw new StackEmptyException();
        }
        return arr[top_index];
    }
    public int size() throws StackEmptyException {
        if(top_index==-1){
            return 0;
        }
        return top_index+1;
    }
}
