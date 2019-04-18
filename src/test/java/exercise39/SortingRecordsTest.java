package exercise39;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SortingRecordsTest {

    SortingRecords sortingRecords = new SortingRecords();

    @Test

    public void doesSortWork(){

        assertThat(sortingRecords.recordSorter()).isEqualTo("Jacquelyn DBA\n Jake Programmer 2016-10-05\n John Manager 2016-2-31\n Michaela District Manager 20165-12-19\n Sally Web Developer 2015-12-18\n Tou Software Engineer 2016-10-05");

    }

}