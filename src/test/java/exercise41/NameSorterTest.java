package exercise41;

import org.assertj.core.util.Lists;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class NameSorterTest {

    private NameSorter nameSorter = new NameSorter();

    @Test
    public void orderedNames() {
        nameSorter.addNamesToUnorderedList("Swift, Geoffrey",
                "Xiong, Fong",
                "Zarnecki, Sabrina",
                "Johnson, Jim",
                "Jones, Aaron",
                "Jones, Chris",
                "Ling, Mai");

        List<String> expectedList = Lists.newArrayList("Johnson, Jim",
                "Jones, Aaron",
                "Jones, Chris",
                "Ling, Mai",
                "Swift, Geoffrey",
                "Xiong, Fong",
                "Zarnecki, Sabrina");

        assertThat(nameSorter.orderListOfNames(nameSorter.listOfUnorderedNames)).isEqualTo(expectedList);
    }

    @Test
    public void orderedSecondListOfNames() {
        nameSorter.addNamesToUnorderedList("Padwell, Mark",
                "Suka, Will",
                "Tang, Will",
                "Tracey, Jonathan",
                "Millman, Jemma",
                "Padwell, Sarah");

        List<String> expectedList = Lists.newArrayList("Millman, Jemma",
                "Padwell, Mark",
                "Padwell, Sarah",
                "Suka, Will",
                "Tang, Will",
                "Tracey, Jonathan");
        assertThat(nameSorter.orderListOfNames(nameSorter.listOfUnorderedNames)).isEqualTo(expectedList);
    }
}





