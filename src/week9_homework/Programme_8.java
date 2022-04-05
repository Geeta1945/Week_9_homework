package week9_homework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
Show which numbers are between 1 and 10 are in the set. (Hint: use for loop and if else
 */
public class Programme_8 {

    public static void main(String[] args) {

        HashSet<Integer> no= new HashSet<>();
        no.add(4);
        no.add(7);
        no.add(8);
        no.add(20);
        no.add(15);
        no.add(1);




        for(int i=2;i<10;i++){

            if(no.contains(i)){

                System.out.println(i+" found in the set - is between 1 -10");
            }

        }


    }

}
