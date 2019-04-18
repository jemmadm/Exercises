package exercise30;

public class MultiplicationTable {

    String multiplication = " ";
    StringBuilder multiplicationTable = new StringBuilder();

    public String timesTables() {

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 13; j++) {
                multiplication = i + " * " + j + " = " + i * j + "\n";
                multiplicationTable.append(multiplication);
            }
        }
        return multiplicationTable.toString();
    }
}
