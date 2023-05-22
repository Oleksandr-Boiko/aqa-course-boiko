package collections;

import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> myHashMap = new HashMap<Integer, String>();
        myHashMap.put(1, "Petro");
        myHashMap.put(2, "Ivan");
        myHashMap.put(3, "Stepan");
        myHashMap.put(4, "Kolya");
        myHashMap.put(5, "Max");
        myHashMap.put(6, "Andrii");
        myHashMap.put(7, "Sveta");
        myHashMap.put(8, "Inna");
        myHashMap.put(9, "Vasyl");
        myHashMap.put(10, "Alex");
        for (Map.Entry<Integer, String> entry : myHashMap.entrySet()){
            if (entry.getKey() % 2 == 0) {
                System.out.println(entry.getValue());
            }
        }
    }
}
