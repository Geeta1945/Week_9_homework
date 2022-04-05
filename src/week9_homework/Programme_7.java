package week9_homework;
/*
Write a java program to test an array list is empty or not. Define array list with underground tube names.
 */
import java.util.ArrayList;

public class Programme_7 {

    public static void main(String[] args) {
        boolean result =isEmpty();
        if(result)
        {
            System.out.println("Array List is Empty");
        }
        else
        {
            System.out.println("Array List is not Empty");
        }

    }
// static method created with boolean return type -no parameter
    public static boolean isEmpty(){
        ArrayList<String> tube_Names= new ArrayList<>();

        tube_Names.add("Bakerloo");
        tube_Names.add("Central");
        tube_Names.add("Jubilee");
        tube_Names.add("District");
        tube_Names.add("Metropolitan");

        return tube_Names.isEmpty();

    }
}
