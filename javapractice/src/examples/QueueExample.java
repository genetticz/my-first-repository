package examples;

import java.util.Deque;
import java.util.LinkedList;

public class QueueExample {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<String>();

        // We can add elements to the queue in various ways
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.pop();
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");
        deque.removeFirst();
        deque.removeLast();
        deque.poll();

        System.out.println(deque);
    }
}
