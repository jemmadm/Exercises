package exercise31;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class KarvonenHeartRateTest {

    KarvonenHeartRate karvonenHeartRate = new KarvonenHeartRate();

    @Test

    public void doesTheFormulaWork(){


        assertThat(karvonenHeartRate.formula(22,65,55)).isEqualTo(138);
    }


    @Test

    public void checkDifferentIntensities(){
        String[] expected = new String[] {"138", "144", "151", "158", "164", "171", "178", "184", "191"};
        assertThat(karvonenHeartRate.checkDifferentIntensities(22,65)).isEqualTo(expected);
    }



}