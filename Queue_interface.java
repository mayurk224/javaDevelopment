import java.util.LinkedList;
import java.util.Queue;

public class Queue_interface {

    // ABOUT QUEUE:
    // * The Queue interface present in the java.util package and extends
    // the Collection interface is used to hold the elements about to
    // be processed in FIFO(First in first out) order.
    // * Its ordered list of objects with its use limited to insert
    // elements at the end of the list and deleting elements from the start
    // of the list, its follows the FIFO or the first in first out principle
    // * Being an interface, the queue needs a concrete class for the
    // declaration, and the most common classes are the PriorityQueue
    // and LinkedList

    // METHODS USE WITH QUEUE:
    // empty queue
    // insertion in queue - enqueue - .add();
    // removing from queue - dequeue - .remove();
    // to return the value at the front of the queue without removing is called Peek - .peek()
    // to get the size of the queue - .size()
    // use .isEmpty() with while loop to check the queue is empty or not

    // DEFINITION OF QUEUE:
    // Queue: an ordered collection that allows adding the "back" element and
    // removing the "front" element, providing FIRST IN FIRST OUT access

    public static void main(String[] args) {

        String[] data = {"to", "be", "or", "not", "to", "be"};
        Queue<String> que = new LinkedList<>();

        // * Three Ways to add data in Queue:
        // 1. Queue<String> que = new LinkedList<>(Arrays.asList(data));
        // 2. que.addAll(Arrays.asList(data));
        // 3. for(String str : data){
        //      que.add(str);
        //     }

        for (String str : data){
            que.add(str);
        }

        // Queue Behaviour:
        System.out.println("QUEUE : "+que);
        System.out.println("PEEK : "+que.peek());
        System.out.println("QUEUE SIZE : "+que.size());

        // while removing elements from queue always check the queue is
        // empty or not by using .isEmpty();
        while(!que.isEmpty()){
            System.out.print(que.remove()+" ");;
        }
    }
}
