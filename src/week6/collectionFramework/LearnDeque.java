package week6.collectionFramework;

import java.util.*;

public class LearnDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);

        System.out.println(dq);

        dq.poll();
        dq.pollLast();
        dq.pollFirst();
        System.out.println(dq);


//        Implementing Stack using ArrayDeque. Which is recommended
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }
}
