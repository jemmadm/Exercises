package exercise38;

public class FilteringValues {

    public String filterEvenNumbers(String numbersAsString) {
        String evenNumberString = "";
        String[] numbersAsArray = numbersAsString.split(" ");
        String[] evenNumbersArray = new String[numbersAsArray.length / 2];
        int index = 0;
        for (String number : numbersAsArray) {
            if (Integer.parseInt(number) % 2 == 0) {
                evenNumbersArray[index] = number;
                index++;
            }
        }
        for (String evenNumber : evenNumbersArray) {
            evenNumberString += evenNumber + " ";
        }
        return evenNumberString.trim();
    }
}