package week9_homework;

import java.util.ArrayList;

public class Programme_4 {

    public static void main(String[] args) {

        Programme_4 obj = new Programme_4();
        obj.getColours();
    }

    public void getColours(){
        ArrayList<String > colours = new ArrayList<>();

        colours.add("Red");
        colours.add("Yellow");
        colours.add("Pink");
        colours.add("Green");
        colours.add("while");
        colours.add("Blue");
        colours.add("Purple");

        for ( String likeColour:colours ) {

            System.out.println(likeColour);

        }


    }


}
