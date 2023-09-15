package week6.collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("Queue: " + q);

//         poll method
        q.poll();
        System.out.println("Updated Queue: " + q);

//        peek method
        System.out.println( q.peek());

    }
}