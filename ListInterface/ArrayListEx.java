package org.example.neha.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers);

        Collections.addAll(numbers,9,8,7,6,5,4);

        numbers.add(4,87);
        System.out.println(numbers);

        //iterate

        Iterator it = numbers.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
