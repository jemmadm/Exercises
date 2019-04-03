package exercise1;

import java.util.Scanner;


public class Exercise1SayingHello {

    public static void main(String[] args) {


        System.out.println("What is your name?");

        String name = new Scanner(System.in).next();



        System.out.println("Hello, " + name + ", nice to meet you!");
    }

}
