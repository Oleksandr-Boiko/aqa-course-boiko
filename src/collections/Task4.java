package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task4 {

    private static Map<String, String> sortMap(Map<String, String> map) {
        Map<String, String> sortedMap = new TreeMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()){
            if (entry.getKey().length() == 3) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
        }
        return sortedMap;
    }

    public static void main(String[] args) {
        Map<String, String> someMap = new HashMap<>();
        someMap.put("a", "Dima");
        someMap.put("aa", "Petya");
        someMap.put("aab", "Alex");
        someMap.put("baca", "Olya");
        someMap.put("abca", "Nina");
        someMap.put("bca", "Katya");
        someMap.put("emp", "Oleg");
        someMap.put("treab", "Roma");
        someMap.put("asd3v", "Inna");

        System.out.println(sortMap(someMap));
    }
}
