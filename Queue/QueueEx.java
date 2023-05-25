package org.example.neha.Queue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class QueueEx {

    public static void main(String[] args) {
        Queue<String> qint = new ArrayDeque<>();

        Collections.addAll(qint,"a","b","c","d");
        qint.add("f"); //add- if the queue gets filled, it throws an exptn

        qint.offer("g"); //offer-if queue gets fills, it will return false

//        System.out.println(qint.peek());
//        System.out.println(qint);
//        System.out.println(qint.element()); //gives element from front part. top one..same as peek.

        System.out.println(qint.remove()); // remove the top element and returns the value.
                                            //if the q is empty it gives throws exptn

    }



}
