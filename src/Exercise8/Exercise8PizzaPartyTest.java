package Exercise8;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class Exercise8PizzaPartyTest {

    private Exercise8PizzaParty exercise8PizzaParty;

    @Before
    public void setup() {
        exercise8PizzaParty = new Exercise8PizzaParty();
    }

    @Test
    public void onePersonNoPizza() {
        assertThat(exercise8PizzaParty.pizzaDivider(1, 0, 0)).isEqualTo("Each person gets 0 slices and there are 0 slices remaining.");
    }

    @Test
    public void onePersonOnePizzaOneSlice() {
        assertThat(exercise8PizzaParty.pizzaDivider(1, 1, 1)).isEqualTo("Each person gets 1 slices and there are 0 slices remaining.");
    }

    @Test
    public void twoPeopleOnePizzaTwoSlices() {
        assertThat(exercise8PizzaParty.pizzaDivider(2, 1, 2)).isEqualTo("Each person gets 1 slices and there are 0 slices remaining.");
    }

    @Test
    public void twoPeopleTwoPizzasTwoSlices() {
        assertThat(exercise8PizzaParty.pizzaDivider(2, 2, 2)).isEqualTo("Each person gets 2 slices and there are 0 slices remaining.");
    }

    @Test
    public void fivePeopleThreePizzasTenSlices() {
        assertThat(exercise8PizzaParty.pizzaDivider(5, 3, 10)).isEqualTo("Each person gets 6 slices and there are 0 slices remaining.");
    }

    @Test
    public void fivePeopleFourPizzasThreeSlices() {
        assertThat(exercise8PizzaParty.pizzaDivider(5, 4, 3)).isEqualTo("Each person gets 2 slices and there are 2 slices remaining.");
    }

    @Test
    public void showLeftovers() {
        assertThat(exercise8PizzaParty.leftoversCalculator(7, 4, 3)).isEqualTo(5);
    }

    @Test
    public void noLeftovers() {
        assertThat

}