package exercise39;

import java.util.Comparator;
import java.util.Map;

public class LastNameComparator implements Comparator<Map<String,String>> {
    @Override
    public int compare(Map<String, String> record1, Map<String, String> record2) {
        return record1.get("Last Name").compareTo(record2.get("Last Name"));
    }
}
