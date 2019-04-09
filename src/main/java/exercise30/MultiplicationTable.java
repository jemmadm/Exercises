package exercise30;

public class MultiplicationTable {

    String multiplication;

    public String timesTables() {

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                multiplication = i + " * " + j + " = " + i * j;
            }
        }
        return multiplication;
    }
}
