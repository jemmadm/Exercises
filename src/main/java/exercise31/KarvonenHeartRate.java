package exercise31;

public class KarvonenHeartRate {

    //scoping?
    private static int[] table = new int[9];
    //scoping?
    private int index = 0;


    public int formula(int age, int restingHR, double intensityAsPercentage) {
        //just return?
        int bpm = (int) ((((220 - age) - restingHR) * (intensityAsPercentage / 100)) + restingHR);
        return bpm;
    }

    public int[] findTargetHeartRate(int age, int restingHR) {
        for (int intensity = 55; intensity <= 95; intensity += 5) {
            table[index] = formula(age, restingHR, intensity);

            if (index < table.length) {
                index++;
            }
        }
        return table;
    }
}
