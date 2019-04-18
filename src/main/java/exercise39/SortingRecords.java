package exercise39;

import java.util.*;

public class SortingRecords {

    public List<String> recordSorter() {

        Map<String, String> sortingRecords = new HashMap<>();

        sortingRecords.put("Johnson","John Manager 2016-2-31");
        sortingRecords.put("Xiong","Tou Software Engineer 2016-10-05");
        sortingRecords.put("Michaelson","Michaela District Manager 20165-12-19");
        sortingRecords.put("Jacobson","Jake Programmer 2016-10-05");
        sortingRecords.put("Jackson","Jacquelyn DBA");
        sortingRecords.put("Weber","Sally Web Developer 2015-12-18");

        List<String> lastNameByKey = new ArrayList<>(sortingRecords.values());
        Collections.sort(lastNameByKey);
        return lastNameByKey;
    }
}
