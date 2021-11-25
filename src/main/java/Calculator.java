import java.util.Scanner;

public class Calculator {

    public static int add(int number1, int number2){
        int result = number1 + number2;
        return result;
    }

    public static int subtract(int number1, int number2){
        int result = number1 - number2;
        return result;
    }

    public static int multiply(int number1, int number2){
        int result = number1 * number2;
        return result;
    }

    public static int divide(int number1, int number2){
        int result = number1 / number2;
        return result;
    }

    public static void main(String args []){

        System.out.println("The calculator methods are: +, -, /, and *.");

        Scanner first= new Scanner(System.in);
        System.out.println("Enter number: ");
        int number1 = first.nextInt();  // Read user input

        Scanner second= new Scanner(System.in);
        System.out.println("Enter method: ");
        String method = second.next();  // Read user input

        Scanner third = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number2 = third.nextInt();  // Read user input

        if (method.equals("+")){
            System.out.println("The result is: " + (add(number1, number2)));
        }else if(method.equals("-")){
            System.out.println("The result is: " + (subtract(number1, number2)));
        }else if(method.equals("*")){
            System.out.println("The result is: " + (multiply(number1, number2)));
        }else if(method.equals("/")){
            System.out.println("The result is: " + (divide(number1, number2)));
        }else{
            System.out.println("Invalid input");
        }
    }
}