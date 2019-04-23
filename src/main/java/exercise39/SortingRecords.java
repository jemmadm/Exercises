package exercise39;

import java.util.*;

public class SortingRecords {

    public Map<String, String> createRecord(String firstName, String lastName, String position, String date){
        Map<String, String> map = new HashMap<>();
        map.put("First Name", firstName);
        map.put("Last Name", lastName);
        map.put("Position", position);
        map.put("Date", date);

        return map;
    }

    public String recordSorter() {

        String unsortedRecords = "";

        Map<String, String> johnMap = createRecord("John", "Johnson", "Manager", "2016-12-31");
        Map<String, String> touMap = createRecord("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Map<String, String> michaelaMap = createRecord("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Map<String, String> jakeMap = createRecord("Jake", "Jacobson", "Programmer", "");
        Map<String, String> jacquelynMap = createRecord("Jacquelyn", "Jackson", "DBA", "");
        Map<String, String> sallyMap = createRecord("Sally", "Weber", "Web Developer", "2015-12-18");

        List<Map<String, String>> records = new ArrayList<>();

        records.add(johnMap);
        records.add(touMap);
        records.add(michaelaMap);
        records.add(jakeMap);
        records.add(jacquelynMap);
        records.add(sallyMap);

        for (Map<String, String> map : records) {
            unsortedRecords += map.get("First Name") + " " + map.get("Last Name") + " " + map.get("Position");

            if (!map.get("Date").isEmpty()) {
                unsortedRecords += " " + map.get("Date");
            }
            unsortedRecords += "\n";
        }
        return unsortedRecords.trim();
    }
}

