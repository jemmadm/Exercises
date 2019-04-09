package exercise31;


public class KarvonenHeartRate {

    public int targetHeartRate;
    public int age;
    public int restingHR;
    public double intensity;

    public int formula(int age, int restingHR, double intensity) {

         targetHeartRate = (int) ((((220 - age) - restingHR) * (intensity/100)) + restingHR);
    return targetHeartRate;
    }

    public int checkDifferentIntensitiies(int age, int restingHR, double intensity) {

        for (int i = 0; i <= 100; i = i+5) {

            targetHeartRate = formula(age, restingHR, intensity);

        }
        return targetHeartRate;
    }

}
