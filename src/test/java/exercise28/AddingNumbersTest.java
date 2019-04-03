package exercise28;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AddingNumbersTest {

    @Test

    public void allAllNumbers(){
        AddingNumbers addingNumbers = new AddingNumbers();

        assertThat(addingNumbers.addNumbers(1,2,3,4,5)).isEqualTo(15);
    }


}