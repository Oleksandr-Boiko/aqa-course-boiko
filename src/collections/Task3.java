package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Olya");
        set.add("Natasha");
        set.add("Polina");
        set.add("Vlad");

        List<String> list = new ArrayList<>();
        list.add("Bohdan");
        list.add("Oleksandr");
        list.add("Vlad");
        list.add("Natasha");

        Set<String> collapse = new HashSet<>();
        collapse.addAll(set);
        collapse.addAll(list);

        System.out.println(collapse);
    }
}
