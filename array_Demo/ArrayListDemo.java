package array_Demo;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String []args){

        ArrayList<Integer> number = new ArrayList<Integer>();

        System.out.println("size = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(4,50);
        System.out.println("ArrayList contains:" +number);


        for (int x : number){
            System.out.print(" "+x);
        }
        for(int i : number){
            System.out.println(i+" ");
        }
        //removing elements
        number.remove(3);

        System.out.println("ArrayList contains:" +number);
        System.out.println();
        System.out.println("size = "+number.size());

    }

}
