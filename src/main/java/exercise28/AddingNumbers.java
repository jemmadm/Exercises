package exercise28;

public class AddingNumbers {

    int finalNumber;

    public int addNumbers(int numberOne, int numberTwo, int numberThree, int numberFour, int numberFive) {

        int numbers[] = {numberOne, numberTwo, numberThree, numberFour, numberFive};

        for (int number: numbers) {
            finalNumber += number;
        }
    return finalNumber;}
}
