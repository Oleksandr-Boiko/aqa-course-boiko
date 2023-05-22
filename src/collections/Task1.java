package collections;

import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("Vova");
        treeSet.add("Andrii");
        treeSet.add("Olya");
        treeSet.add("Petya");
        for (String i : treeSet) {
            System.out.println(i);
        }
        System.out.println("Main list: " + treeSet);
        treeSet.add("Stepan");
        System.out.println("After add new value: " + treeSet);
    }
}
