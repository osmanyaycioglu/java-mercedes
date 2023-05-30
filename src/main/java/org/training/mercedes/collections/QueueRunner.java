package org.training.mercedes.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class QueueRunner {
    public static void main(String[] args) {
        Queue<String> stringQueue = new ArrayBlockingQueue<>(1_000);
        stringQueue.add("data1");
        stringQueue.add("data2");
        String poll = stringQueue.poll();
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<>(1_000);
        try {
            String take = blockingQueue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Deque<String>  stringDeque = new ArrayDeque<>(1_000);
        stringDeque.addFirst("data1");
        stringDeque.addFirst("data2");
        String first = stringDeque.getFirst();

    }
}
