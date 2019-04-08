package exercise26;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CreditCardCalculatorTest {

    @Test

    public void doesCalculateMonthsWork(){
        CreditCardCalculator creditCardCalculator = new CreditCardCalculator();
        assertThat(creditCardCalculator.calculateMonthsUntilPaidOff(7000,12,100)).isEqualTo(70);
    }



}