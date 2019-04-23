package exercise39;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.*;

public class SortingRecordsTest {

    private SortingRecords sortingRecords = new SortingRecords();

    List<Map<String, String>> records = sortingRecords.recordsCreator();

    @Test
    public void sortByLastNames() {
        assertThat(sortingRecords.recordSorter(records)).isEqualTo("Jacquelyn Jackson DBA\n" +
                "Jake Jacobson Programmer\n" +
                "John Johnson Manager 2016-12-31\n" +
                "Michaela Michaelson District Manager 2015-12-19\n" +
                "Sally Weber Web Developer 2015-12-18\n" +
                "Tou Xiong Software Engineer 2016-10-05");
    }

    @Test
    public void filterNames() {
        assertThat(sortingRecords.recordFilter("Jac", records)).isEqualToIgnoringCase("Jake Jacobson Programmer\n" + "Jacquelyn Jackson DBA");
    }
}