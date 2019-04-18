package exercise39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortingRecords {

    public static void main(String[] args) {

        List <String>lastName = new ArrayList<>();

        lastName.add("Johnson");
        lastName.add("Xiong");
        lastName.add("Michaelson");
        lastName.add("Jacobson");
        lastName.add("Jackson");
        lastName.add("Weber");

        Map<String, List<String>> sortingRecords = new HashMap<>();

        sortingRecords.put("Last Name", lastName);

        System.out.println(sortingRecords);
    }
}
