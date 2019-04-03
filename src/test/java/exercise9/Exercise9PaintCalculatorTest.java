package exercise9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise9PaintCalculatorTest {

    private Exercise9PaintCalculator exercise9PaintCalculator;

    @Before
    public void setup() {
        exercise9PaintCalculator = new Exercise9PaintCalculator();
    }

    @Test

    public void noValueForWidth() {
        assertThat(exercise9PaintCalculator.(0, 3)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void noValueForLength() {
        assertThat(exercise9PaintCalculator.paintNeeded(5, 0)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void noValues() {
        assertThat(exercise9PaintCalculator.paintNeeded(0, 0)).isEqualTo("0 gallons of paint needed");
    }

    @Test
    public void valuesOf1() {
        assertThat(exercise9PaintCalculator.paintNeeded(1, 1)).isEqualTo("1 gallons of paint needed");
    }


    @Test
    public void areaIs350() {
        assertThat(exercise9PaintCalculator.paintNeeded(350, 1)).isEqualTo("1 gallons of paint needed");
    }

    @Test
    public void areaIs700() {
        assertThat(exercise9PaintCalculator.paintNeeded(350, 2)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void areaIs360() {
        assertThat(exercise9PaintCalculator.paintNeeded(60, 6)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void areaIs750() {
        assertThat(exercise9PaintCalculator.paintNeeded(375, 2)).isEqualTo("3 gallons of paint needed");
    }

    @Test
    public void width349Length1() {
        assertThat(exercise9PaintCalculator.paintNeeded(349, 1)).isEqualTo("1 gallons of paint needed");
    }

    @Test
    public void width351Length1() {
        assertThat(exercise9PaintCalculator.paintNeeded(351, 1)).isEqualTo("2 gallons of paint needed");
    }

    @Test
    public void width2264Length3() {
        assertThat(exercise9PaintCalculator.paintNeeded(2263, 3)).isEqualTo("20 gallons of paint needed");
    }

    @Test
    public void roundRoom(){
    }
}

}