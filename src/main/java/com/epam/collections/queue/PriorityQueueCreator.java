package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o2.compareTo(o1) <= 0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });

        for (String s : firstList) {
            if (queue.contains(s)){
                queue.add(s);
            }
        }
        for (String s : secondList) {
            if (queue.contains(s)){
                queue.add(s);
            }
        }

        return queue;
    }
}
