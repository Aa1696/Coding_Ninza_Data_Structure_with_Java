package Stack;
import java.util.*;

public class Histogram_Area {
    public static int largestRectangle(ArrayList < Integer > heights) {
        // Write your code here.
        //Immediate smaller element to the left including the given number
        int maxarea=0;
        ArrayList<Integer>left=Imemediateleftgreater(heights);
        //Immediate smaller element to the right including the given number
        int right[]=Imemediaterightgreater(heights);

        //adding above two will give width and multilplying it with height will give area
        for(int i=0;i<heights.size();i++){
            int left_width=left.get(i)-1;
            System.out.println("i="+i+" "+"left="+ left.get(i) + " "+"right="+right[i]);
            System.out.println("Left_width"+":"+left_width);
            int right_width=right[i]-1;
            System.out.println("Right_width"+":"+right_width);
            int width=left_width+right_width+1;
            int ar1=width*heights.get(i);
            System.out.println("i="+i+" "+"area="+ar1);
            maxarea=Math.max(ar1,maxarea);
        }
        return maxarea;
        //will maintain max area

    }
    public static int[] Imemediaterightgreater(ArrayList<Integer>height){
        int n=height.size();
        int arr[]=new int[n];
        //arr[n-1]=n;
        Stack<Integer>st=new Stack<>();
        st.push(n-1);
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && height.get(st.peek())>=height.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=n-i;
            }
            else{
                int k=st.peek();
                arr[i]=k-i;
            }
            st.push(i);
        }
        return arr;
    }
    public static ArrayList<Integer> Imemediateleftgreater(ArrayList<Integer>arr){
        Stack<Integer>st=new Stack<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            while(!st.isEmpty()&& arr.get(st.peek())>=arr.get(i)){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(i+1);
            }
            else{
                int k=st.peek();
                ans.add(i-k);
            }
            st.push(i);
        }
        return ans;

    }
    public static void main(String[]args){
        //20
        Integer arr1[]={14, 8, 9, 10, 3, 5, 20, 10, 15, 2, 11, 18, 13, 3, 13, 14, 11, 8, 5, 13};
//                  Left=1 2 1 1 5 1 1 2 1 10 1 1 2 4 1 1 3 4 5 1
//                   right=[1, 3, 2, 1, 5, 4, 1, 2, 1, 12, 3, 1, 1, 8, 2, 1, 1, 1, 3, 2]
        ArrayList<Integer>heights=new ArrayList<>(Arrays.asList(arr1));

//        heights.add(8);
//        heights.add(6);
//        heights.add(3);
//        heights.add(5);
//        heights.add(0);
//        heights.add(0);
//        heights.add(4);
//        heights.add(10);
//        heights.add(2);
//        heights.add(5);
        Histogram_Area hs=new Histogram_Area();
        ArrayList<Integer>left=hs.Imemediateleftgreater(heights);

        int []arr={8, 6, 3, 5, 0, 0, 4, 10, 2, 5};
        System.out.println("Array"+"="+Arrays.toString(arr1));
        System.out.print("Left"+"=");
        for(int i:left){
            System.out.print(i+" ");
        }
        System.out.println();
        int[]right=hs.Imemediaterightgreater(heights);
        System.out.println("right"+"="+Arrays.toString(right));
        int area=largestRectangle(heights);
        System.out.println("Area"+" "+area);


    }
}
