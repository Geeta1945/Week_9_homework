package week9_homework;
/*
        Write a Java program to iterate through all elements in an array list using Iterator
         */
import java.util.ArrayList;
import java.util.Iterator;

public class Programme_5 {



        public static void main(String[] args) {
            ArrayList<Integer> score = new ArrayList();// creating ArrayList with Integer type

            score.add(10);
            score.add(20);
            score.add(30);
            score.add(5);
            score.add(25);

            // creating iterator for the score ArrayList

            Iterator<Integer> iter = score.iterator();

            while (iter.hasNext()) {

                System.out.println(iter.next());
            }

        }
    }



