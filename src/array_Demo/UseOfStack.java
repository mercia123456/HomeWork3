package array_Demo;

import java.util.Stack;

public class UseOfStack {
    public static void main(String[]args){

        Stack<String> st= new Stack<String>();

        st.add("Farida");
        st.add("FArhad");
        st.add("Victor");
        st.add("Cathy");
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println("Farida");
    }
}
