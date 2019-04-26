package exercise39;
import java.time.LocalDate;
import java.util.*;

public class SortingRecords {

    public Map<String, String> createRecord(String firstName, String lastName, String position, LocalDate date) {
        Map<String, String> map = createRecord(firstName, lastName, position);
        map.put("Date", " " + date);
        return map;
    }

    public Map<String, String> createRecord(String firstName, String lastName, String position) {
        Map<String, String> map = new HashMap<>();
        map.put("First Name", firstName);
        map.put("Last Name", lastName);
        map.put("Position", position);
        map.put("Date", "");
        return map;
    }

    public List<Map<String, String>> recordsCreator() {
        Map<String, String> johnMap = createRecord("John", "Johnson", "Manager", LocalDate.of(2016,12,31));
        Map<String, String> touMap = createRecord("Tou", "Xiong", "Software Engineer", LocalDate.of(2016,10,5));
        Map<String, String> michaelaMap = createRecord("Michaela", "Michaelson", "District Manager", LocalDate.of(2015,12,19));
        Map<String, String> jakeMap = createRecord("Jake", "Jacobson", "Programmer");
        Map<String, String> jacquelynMap = createRecord("Jacquelyn", "Jackson", "DBA");
        Map<String, String> sallyMap = createRecord("Sally", "Weber", "Web Developer", LocalDate.of(2015,12,18));

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
        records.sort(Comparator.comparing(record -> record.get("Last Name")));

        for (Map<String, String> map : records) {
            unsortedRecords += map.get("First Name") + " " + map.get("Last Name") + " " + map.get("Position") + "" + map.get("Date");
            unsortedRecords += "\n";
        }
        return unsortedRecords.trim();
    }

    public String recordFilter(String searchTerm, List<Map<String, String>> records) {

        String filteredRecords = "";

        records.removeIf(map -> !map.get("First Name").contains(searchTerm) && !map.get("Last Name").contains(searchTerm));

        for (Map<String, String> map : records) {
            filteredRecords += map.get("First Name") + " " + map.get("Last Name") + " " + map.get("Position") + "\n";
        }
        return filteredRecords.trim();
    }
}