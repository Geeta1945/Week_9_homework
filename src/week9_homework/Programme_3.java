package week9_homework;

import java.util.Arrays;
//Write a Java program to reverse an array of integer values.
public class Programme_3 {

    public static void main(String[] args) {
        int [] arry  = {6,8,24,30,25,9};
        System.out.println("Original array : "+ Arrays.toString(arry));// printing original array values
        for(int i =0;i< arry.length/2;i++){ // for loop will be executed until condition is true

            int temp = arry[i]; // storing array i index value into temp variable
            arry[i] =arry[arry.length-i-1]; // assigning last index value to first and so on in for loop
            arry[arry.length-i-1]=temp; // assigning first index value stored in temp to last index and so on

        }

        System.out.println("Reverse array : "+Arrays.toString(arry)); // printing reversed array values

    }

}
