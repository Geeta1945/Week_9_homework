package week9_homework;
import java.util.Scanner;
public class Programme_2 {

     static String name, result = null,Grade =null;
   static int roll_no;
    static int maths, science, english;
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your name : ");
        name = obj.next();
        System.out.println("Enter your roll no: ");
        roll_no = obj.nextInt();
        System.out.println("Enter your maths marks: ");
        maths = obj.nextInt();

        if (maths < 0 || maths > 100) {

            do {
                System.out.println("Invalid Input,Marks should be between 0 to 100");
                System.out.println("Enter your maths marks: ");
                maths = obj.nextInt();
            } while (maths < 0 || maths > 100);
        }

        System.out.println("Enter your science marks : ");
        science = obj.nextInt();

        if (science < 0 || science > 100) {

            do {

                System.out.println("Invalid Input,Marks should be between 0 to 100");
                System.out.println("Enter your science marks : ");
                science = obj.nextInt();
            } while (science < 0 || science > 100);
        }


        System.out.println("Enter your english marks : ");
        english = obj.nextInt();

        if (english < 0 || english > 100) {
            do {

                System.out.println("Invalid Input,Marks should be between 0 to 100");
                System.out.println("Enter your english marks : ");
                english = obj.nextInt();
            } while (english < 0 || english > 100);
        }

        double total = maths+science+english;
        System.out.println(maths+" "+science+" "+english+" "+total);
        Programme_2 obj1 = new Programme_2();
        obj1.printMarkSheet(maths,science,english);



        // instance method for printing marksheet of student




    }

    public void printMarkSheet (int maths_marks,int science_marks,int english_marks){
        double total = maths + science + english;

        double percentage = (maths + science + english) / 3;

        if (percentage >= 80) {

            Grade = "A+";
            result ="Pass";
        } else if (percentage >= 60) {
            Grade = "A";
            result ="Pass";
        } else if (percentage >= 50) {
            Grade = "B";
            result ="Pass";
        } else if (percentage >= 35) {
            Grade = "C";
            result ="Pass";
        } else if (percentage < 35) {
            result = "FAIL";
            Grade = "";
        }
        System.out.println("_________________________________________\n" +
                "|                                       |\n" +
                "|                Mark Sheet             |\n" +
                "|_______________________________________|\n" +
                "|  Name          :" + name + "                   |\n" +
                "|  Roll No       :" + roll_no + "                      |\n" +
                "|________________________________________|\n" +
                "|  Subjects      :          Marks        |\n" +
                "|________________________________________|\n"+
                "|  Maths         :" + maths + "                     |\n" +
                "|  Science       :" + science + "                     |\n" +
                "|  English       :" + english + "                     |\n" +
                "|________________________________________|\n"+
                "|  Total         :" +  total + "                  |\n"+
                "|________________________________________|\n"+
                "|  Percentage    :" + percentage + "                   |\n" +
                "|  Result        :" + result + "                   |\n" +
                "|  Grade         :" + Grade + "                      |\n" +
                "|________________________________________|\n"


        );

    }


}
