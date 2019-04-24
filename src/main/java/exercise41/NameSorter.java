package exercise41;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameSorter {

    public List<String> listOfUnorderedNames = new ArrayList<>();

    public void addNamesToUnorderedList(String... names) {
        listOfUnorderedNames.addAll(Arrays.asList(names));
    }

    public List<String> orderListOfNames(List<String> listOfUnorderedNames) {
        Collections.sort(listOfUnorderedNames);
        return listOfUnorderedNames;
    }
}