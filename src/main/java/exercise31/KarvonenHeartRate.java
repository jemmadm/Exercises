package exercise31;

public class KarvonenHeartRate {

    private static String[] table = new String[9];


    public int formula(int age, int restingHR, double intensity) {

        int bpm = (int) ((((220 - age) - restingHR) * (intensity / 100)) + restingHR);
        return bpm;
    }

    public String checkDifferentIntensities(int age, int restingHR) {
            for (double intensity = 55; intensity <= 95; intensity = intensity + 5)
                for (int i = 0; i < table.length ; i++){
                table[i] += (formula(age, restingHR, intensity) + ", ");
            }

        return table[8];
    }

    public static void main(String[] args) {
        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        karvonenHeartRate.checkDifferentIntensities(25,65);
    }
}
