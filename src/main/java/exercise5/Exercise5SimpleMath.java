import java.util.Scanner;

public class Exercise5SimpleMath {
    public static void main(String[] args) {


        System.out.println("What is the first number?");

        String stringFirstNumber = new Scanner(System.in).next();


        System.out.println("What is the second number?");

        String stringSecondNumber = new Scanner(System.in).next();

        int firstNumber = Integer.parseInt(stringFirstNumber);
        int secondNumber = Integer.parseInt(stringSecondNumber);

        String add = stringFirstNumber + " + " + stringSecondNumber + " = " + (firstNumber + secondNumber);
        String subtract = stringFirstNumber + " - " + stringSecondNumber + " = " + (firstNumber - secondNumber);
        String multiply = stringFirstNumber + " * " + stringSecondNumber + " = " + (firstNumber * secondNumber);
        String divide = stringFirstNumber + " / " + stringSecondNumber + " = " + (firstNumber / secondNumber);


        System.out.println(add + "\n" + subtract + "\n" + multiply + "\n" + divide);

    }

}
