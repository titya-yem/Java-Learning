package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
      public static void show () {
          // ArrayDeque means that it is LIFO, and enter from the end
          Queue<String> queue = new ArrayDeque<>();
          queue.add("c");
          queue.add("a");
          queue.add("b");
//          queue.offer("d"); it will add to the beginning of the array or queue
          // b - a - c
          var element = queue.element(); // throw an exception if queue is empty
          String front = queue.peek(); // return null if queue is empty
          var removeFront = queue.remove(); // will remove c
          var poll  = queue.poll(); // if empty = null or will remove throw an exception
          System.out.println(front);
      }
}
