package week9_homework;
/*
Create a HashMap object called people that will store String keys and
Integer values: And use for each loop to iterate the value from Map.
 */
import java.util.HashMap;
import java.util.Map;

public class Programme_9 {

    public static void main(String[] args) {
        getCloths();
    }


    public static void getCloths() {

        Map<String, Integer> people = new HashMap<>();

        people.put("T-Shirts", 10);
        people.put("Trousers", 5);
        people.put("Shoes", 2);
        people.put("scarfs", 5);

        for (Map.Entry<String, Integer> kidsClothes : people.entrySet()) {

            System.out.println(kidsClothes);


        }
    }
}





