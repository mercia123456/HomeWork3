package array_Demo;

import java.util.Scanner;

public class Array2 {

    private static int i;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] number = new double[5];
        double sum = 0;
        System.out.println("Please enter 5 numbers:");

        for (int i = 0; i < 5; i++) { //for (int i = 0; i < number.length; i ++)
            number[i] = input.nextDouble();
        }

        // for (int i = 0; i < number.length; i ++)
        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        double avg = 5; //double ave = sum/number.leanth; i++)
        System.out.println("The sum is :" + sum);
        System.out.println("Average is : " + avg);

        double max = number[0];
        double min = number[0];
        for (int i = 1; i < 5; i++) ;


        if (max < number[i]) {
            max = number[i];
        }
        if (min > number[i]) {
            min = number[i];
        }


        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);

    }


}
