package exercise38;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FilteringValuesTest {

    FilteringValues filteringValues = new FilteringValues();

    @Test
    public void evenNumbersOutput(){
        assertThat(filteringValues.filterEvenNumbers("1 2 3 4 5 6 7 8")).isEqualTo("2 4 6 8");
    }
}