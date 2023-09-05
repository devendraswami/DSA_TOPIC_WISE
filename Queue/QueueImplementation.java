import java.util.Queue; 
import java.util.*; 

public class QueueImplementation {
    public static void main(String[] args) {
        
        
        Queue<Integer> q  = new LinkedList<>(); 

        // add() to add elements to the queue - enqueue

        for(int i = 0; i<10 ; i++) {
            q.add(i);
        } 

        System.out.println(q); 

     // remove() - deque (Remove the first element which was entred ) 

       q.remove(); 
      
        System.out.println(q); 

        // In Queue the top most element will be the element which was first entred 
        // peek() - to fetch the top most element in the queue

        System.out.println("The top most element in the Queue is : " + q.peek()); 

        // size() - to give the size of queue 
        
        System.out.println("The size of the Queue is : "+q.size());

    }
}