package exercise39;

import java.util.*;

public class SortingRecords {

    public Map<String, String> createRecord(String firstName, String lastName, String position, String date) {
        Map<String, String> map = createRecord(firstName, lastName, position);
        map.put("Date", date);
        return map;
    }

    public Map<String, String> createRecord(String firstName, String lastName, String position) {
        Map<String, String> map = new HashMap<>();
        map.put("First Name", firstName);
        map.put("Last Name", lastName);
        map.put("Position", position);
        return map;
    }

    public List<Map<String, String>> recordsCreator() {
        Map<String, String> johnMap = createRecord("John", "Johnson", "Manager", "2016-12-31");
        Map<String, String> touMap = createRecord("Tou", "Xiong", "Software Engineer", "2016-10-05");
        Map<String, String> michaelaMap = createRecord("Michaela", "Michaelson", "District Manager", "2015-12-19");
        Map<String, String> jakeMap = createRecord("Jake", "Jacobson", "Programmer");
        Map<String, String> jacquelynMap = createRecord("Jacquelyn", "Jackson", "DBA");
        Map<String, String> sallyMap = createRecord("Sally", "Weber", "Web Developer", "2015-12-18");

        List<Map<String, String>> records = new ArrayList<>();

        records.add(johnMap);
        records.add(touMap);
        records.add(michaelaMap);
        records.add(jakeMap);
        records.add(jacquelynMap);
        records.add(sallyMap);

        return records;
    }

    public String recordSorter(List<Map<String, String>> records) {

        String unsortedRecords = "";
        records.sort(
                Comparator.comparing(record -> record.get("Last Name")));

        for (Map<String, String> map : records) {
            String date = map.get("Date");
            unsortedRecords += map.get("First Name") + " " + map.get("Last Name") + " " + map.get("Position");

            if (date != null && !date.isEmpty()) {
                unsortedRecords += " " + date;
            }
            unsortedRecords += "\n";
        }
        return unsortedRecords.trim();
    }

    public String recordFilter(String searchTerm, List<Map<String, String>> records) {

        String filteredRecords = "";
        for (Map<String, String> map : records) {
            if (map.get("First Name").contains(searchTerm) || map.get("Last Name").contains(searchTerm)) {
                filteredRecords += map.get("First Name") + " " + map.get("Last Name") + " " + map.get("Position");
            }
            filteredRecords += "\n";
        }
        return filteredRecords.trim();
    }
}

