import java.util.Scanner;
import java.time.*;

public class Exercise6RetirementCalculator {

    public static void main(String[] args) {
        System.out.println("What is your current age?");

        String stringCurrentAge = new Scanner(System.in).next();

        System.out.println("At what age would you like to retire?");

        String stringRetirementAge = new Scanner(System.in).next();

        int currentAge = Integer.parseInt(stringCurrentAge);
        int retirementAge = Integer.parseInt(stringRetirementAge);
        int yearsTillRetire = retirementAge-currentAge;
        int date = LocalDate.now().getYear();


        System.out.println("You have " + yearsTillRetire + " years left until you can retire.");

        System.out.println("It's " + date + "," + " so you can retire in " + (date+yearsTillRetire));
    }
}
