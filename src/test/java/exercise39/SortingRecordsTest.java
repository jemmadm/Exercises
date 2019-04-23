package exercise39;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SortingRecordsTest {

    SortingRecords sortingRecords = new SortingRecords();

    @Test
    public void sortByLastNames() {
        assertThat(sortingRecords.recordSorter()).isEqualTo("Jacquelyn Jackson DBA\n" +
                "Jake Jacobson Programmer\n" +
                "John Johnson Manager 2016-12-31\n" +
                "Michaela Michaelson District Manager 2015-12-19\n" +
                "Sally Weber Web Developer 2015-12-18\n" +
                "Tou Xiong Software Engineer 2016-10-05");
    }
}