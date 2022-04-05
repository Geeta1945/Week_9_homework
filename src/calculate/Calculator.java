package calculate;

public class Calculator {

// instance methods created to do calculations based on which Symbol received from user

    // Instance method 1

    public void addition(int a, int b)
    {
        int sum;
        sum =a+b;
        System.out.println("Addition of " + a+" and "+ b+" is :"+sum);
    }


    // Instance method 2
    public void subtraction(int a, int b)
    {
        int sub;
        sub=a-b;
        System.out.println("Subtraction of " + a+" and "+ b+" is :"+sub);
    }

    // Instance method 3
    public void division(int a, int b)
    {
        int div;
        div=a/b;
        System.out.println("Division of " + a+" and "+ b+" is :"+div);
    }

    // Instance method 4
    public void multiplication(int a, int b)
    {
        int mul;
        mul =a*b;
        System.out.println("Multiplication of " + a+" and "+ b+" is :"+mul);

    }

    //Instance method
    public void calculateResult(int no1, int no2, char c){

        if (c=='+'){  // checking Symbol entered by user and executing the right method which match with
            // condition in if else statement

            addition(no1,no2);
        }
        else if (c=='-'){

            subtraction(no1,no2);
        }
        if (c=='*'){

            multiplication(no1,no2);
        }
        if (c=='/'){

            division(no1,no2);

        }

    }

}
