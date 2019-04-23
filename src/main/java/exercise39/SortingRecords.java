package exercise39;

import java.util.*;

public class SortingRecords {

    public String recordSorter() {

        String lastNames = "";
        String firstNames = "";
        String position = "";
        String date = "";
        String unsortedRecords = "";

        Map<String, String> johnMap = new HashMap<>();
        johnMap.put("First Name", "John");
        johnMap.put("Last Name", "Johnson");
        johnMap.put("Position", "Manager");
        johnMap.put("Date", "2016-12-31");

        Map<String, String> touMap = new HashMap<>();
        touMap.put("First Name", "Tou");
        touMap.put("Last Name", "Xiong");
        touMap.put("Position", "Software Engineer");
        touMap.put("Date", "2016-10-05");

        Map<String, String> michaelaMap = new HashMap<>();
        michaelaMap.put("First Name", "Michaela");
        michaelaMap.put("Last Name", "Michaelson");
        michaelaMap.put("Position", "District Manager");
        michaelaMap.put("Date", "2015-12-19");

        Map<String, String> jakeMap = new HashMap<>();
        jakeMap.put("First Name", "Jake");
        jakeMap.put("Last Name", "Jacobson");
        jakeMap.put("Position", "Programmer");
        jakeMap.put("Date", "");

        Map<String, String> jacquelynMap = new HashMap<>();
        jacquelynMap.put("First Name", "Jacquelyn");
        jacquelynMap.put("Last Name", "Jackson");
        jacquelynMap.put("Position", "DBA");
        jacquelynMap.put("Date", "");

        Map<String, String> sallyMap = new HashMap<>();
        sallyMap.put("First Name", "Sally");
        sallyMap.put("Last Name", "Weber");
        sallyMap.put("Position", "Web Developer");
        sallyMap.put("Date", "2015-12-18");

        List<Map<String, String>> records = new ArrayList<>();
        records.add(johnMap);
        records.add(touMap);
        records.add(michaelaMap);
        records.add(jakeMap);
        records.add(jacquelynMap);
        records.add(sallyMap);

        for (Map<String, String> map : records) {
            unsortedRecords += map.get("First Name") + " " + map.get("Last Name") + " " + position + map.get("Position") + " " + date + map.get("Date") + "\n";
        }
        return unsortedRecords.trim();
    }
}

