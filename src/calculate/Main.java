package calculate;
/*
1. Write a java program using the following descriptions
1. Create one package with name calculate
2. Create two class with name “Calculator” and “Main”
3. Create four methods with manes “addition”, “subtraction”, “division”,
and “multiplication”. All methods are instance method ,so it doesn’t
return anything. But it has two parameters with name “int a” and “int
b”.Also each method have System.out.println(). This prints the result.
Also create all one more method with name “calculateResult” with
three parameter with name int a, int b and char symbol. Write the logic
in calculateResult method that when user enter first number and
second number and symbol based on symbol it does calculate.
4. Write a “main” method into main class. It has scanner that takes user
input. Also write the logic that it ask user to “Enter first Number:”,
“Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
enter + symbol result like “Addition of 5 and 10 is: 15” and respective
for other symbol.
5. With the result it’s also print one more message “Would you like to do
more calculation Please enter “Y” or “N” :” (Hint use while loop if user
enter Y program asking the user to enter First Number, and if user enter
N programme should terminate)

 */
import java.util.Scanner;
// Main is subclass /child class/derived class of parent class/super class Calculate


public class Main extends Calculator{
    public static void main(String[] args) {

        int first,second;
        char ch;

        // allowing user to enter two number and symbol


        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter First Number : ");
        first =scanner.nextInt();   // storing information received from  user

        System.out.println("Please enter Second Number :");
        second =scanner.nextInt();
        System.out.println("Please enter one of symbol +,-,*,/ : ");
        ch =scanner.next().charAt(0);

        Main obj = new Main();
        obj.calculateResult(first,second,ch); // calling method from parent class Calculator to calculate and print result
        char answer='c';
        System.out.println("Would you like to do more calculation Please enter Y or N :");
        answer =scanner.next().charAt(0); // storing answer entered by user
        if(answer=='Y') { // if entered Y then while loop will be executed else program will terminate
            while (answer == 'Y') {

                System.out.println("Please enter First Number : ");
                first = scanner.nextInt();

                System.out.println("Please enter Second Number :");
                second = scanner.nextInt();
                System.out.println("Please enter one of symbol +,-,*,/ : ");
                ch = scanner.next().charAt(0);
                obj.calculateResult(first, second, ch);
                System.out.println("Would you like to do more calculation Please enter Y or N :");
                answer = scanner.next().charAt(0);
            }

        }
    }

}
