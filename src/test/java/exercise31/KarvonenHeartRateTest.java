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
        assertThat(karvonenHeartRate.checkDifferentIntensitiies(22,65,55)).isEqualTo(138);
    }



}