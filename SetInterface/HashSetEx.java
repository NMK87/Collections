package org.example.neha.SetInterface;

import java.util.*;

public class HashSetEx {

    public static void main(String[] args) {

        Set<String> exmaples = new HashSet<>();

        Collections.addAll(exmaples, "abc", "efg","hij","klm","nop");
        System.out.println(exmaples);

        //if we want to remove duplicates we can convert collections to set

        Collection<String> col = new ArrayList<>();
        Collections.addAll(col,"nehu","neha","nehu","neha");
        Set<String> set = new HashSet<>(col);
        System.out.println(set);

        //operations

        Set<String> set1 = new HashSet<>(Arrays.asList("a","b","c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("e","f","g","a"));

        set1.addAll(set2); // union operation
        System.out.println(set1);

        set1.retainAll(set2); //intersetions
        System.out.println(set1);

        set1.removeAll(set2); //difference
        System.out.println(set1);

    }
}
