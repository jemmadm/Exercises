package exercise39;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SortingRecordsTest {

    SortingRecords sortingRecords = new SortingRecords();

    @Test
    public void unsortedRecords() {
        assertThat(sortingRecords.recordSorter()).isEqualTo("John Johnson Manager 2016-12-31\n" +
                "Tou Xiong Software Engineer 2016-10-05\n" +
                "Michaela Michaelson District Manager 2015-12-19\n" +
                "Jake Jacobson Programmer\n" +
                "Jacquelyn Jackson DBA\n" +
                "Sally Weber Web Developer 2015-12-18");
    }

    @Test
    public void sortLastNames() {
        assertThat(sortingRecords.recordSorter()).contains("Jacquelyn", "Jackson", "DBA",
                "Jake", "Jacobson", "Programmer", "2016-10-05",
                "John", "Johnson", "Manager", "2016-2-31",
                "Michaela", "Michaelson", "District Manager", "20165-12-19",
                "Sally", "Weber", "Web Developer", "2015-12-18",
                "Tou", "Xiong", "Software Engineer", "2016-10-05");
    }
}