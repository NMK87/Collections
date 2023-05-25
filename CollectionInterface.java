package org.example.neha;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CollectionInterface {

    public static void main(String[] args) {

            Collection<String> name = new ArrayList<>();

            name.add("neha");
            name.add("ananya");
            name.add("chaitra");

        Collections.addAll(name, "apple","banana","orange");
        System.out.println(name);

        Collection<String> names = new ArrayList<>();
        Collections.addAll(name);

        System.out.println(name.equals(names));
        System.out.println(name.size());
        name.remove("neha");
        System.out.println(name);
        System.out.println(name.contains("banana"));


        //iterating it hasnext()--> returns true if there are elements in it or gives false
        // next() --> goes to the next element

        Iterator it = name.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }




}
