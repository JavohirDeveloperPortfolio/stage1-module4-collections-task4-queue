package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.addLast(firstQueue.poll());
        arrayDeque.addLast(firstQueue.poll());
        arrayDeque.addLast(secondQueue.poll());
        arrayDeque.addLast(secondQueue.poll());

        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            firstQueue.add(arrayDeque.pollLast());
            arrayDeque.offerLast(firstQueue.poll());
            arrayDeque.offerLast(firstQueue.poll());

            secondQueue.add(arrayDeque.pollLast());
            arrayDeque.offerLast(secondQueue.poll());
            arrayDeque.offerLast(secondQueue.poll());
        }
        return arrayDeque;
    }
}
