package exercise31;

public class KarvonenHeartRate {

    public int formula(int age, int restingHR, double intensityAsPercentage) {

        return (int) ((((220 - age) - restingHR) * (intensityAsPercentage / 100)) + restingHR);
    }

    public int[] findTargetHeartRate(int age, int restingHR) {
        int[] table = new int[9];

        for (int index = 0; index <= 8; index ++) {
            table[index] = formula(age, restingHR, index*5+55);

        }
        return table;
    }
}
