import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class collection_queue{
	public static void main(String[] args) {
		Deque<String> queue = new Deque<>();
        queue.offer("u.p");
        queue.offer("M.p");
        queue.offer("Rajasthan");
        queue.offer("assam");
        queue.offer("harayan");
        queue.offer("bihar");
        queue.offer("maharastra");
        queue.offer("gujrat");
        queue.offer("telgana");
        queue.offer("delhi");
        queue.addFirst("jjfjdd");

        for (String element : queue) {
            System.out.println(element + " ");
        }
        System.out.println();
        

    }

	
}
