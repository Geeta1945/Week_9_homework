package week9_homework;
/*
Write a java program to retrieve an element(at a specified index) from a given array list
 */
import java.util.ArrayList;

public class Programme_6 {

    public static void main(String[] args) {

        Programme_6 obj = new Programme_6();

        obj.getElement(2);
    }

    public void getElement(int a){
        ArrayList<Integer> number =new ArrayList();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        System.out.println(number.get(a));

    }

}
