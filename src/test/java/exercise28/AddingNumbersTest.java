package exercise28;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class AddingNumbersTest {

    @Test

    public void allAllNumbers(){
        AddingNumbers addingNumbers = new AddingNumbers();
        int numbers [] = {1,2,3,4,5};
        assertThat(addingNumbers.addNumbers(numbers)).isEqualTo(15);
    }


}