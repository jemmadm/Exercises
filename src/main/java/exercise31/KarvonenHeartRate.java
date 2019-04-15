package exercise31;

public class KarvonenHeartRate {

    //Data type?
    private static String[] table = new String[9];

    private int index = 0;


    public int formula(int age, int restingHR, double intensity) {

        int bpm = (int) ((((220 - age) - restingHR) * (intensity / 100)) + restingHR);
        return bpm;
    }

    //Naming / data-type?
    public String[] checkDifferentIntensities(int age, int restingHR) {
        //Shorter way to do addition?
        for (double intensity = 55; intensity <= 95; intensity = intensity + 5) {
            //Brackets and whitespace?
            table[index] = (formula(age, restingHR, intensity) + "");

            //Why the additional counter?
            if(index < table.length){
                index++;
            }

        }
        //What about printing out the whole table?
        return table;
    }

    //What's this main method doing?
    public static void main(String[] args) {
        KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();
        karvonenHeartRate.checkDifferentIntensities(25, 65);
    }
}
