import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Iterator;

public class Maximum_queue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Queue<Integer> numberQueue = new LinkedList<>();

      
        System.out.println("Enter 10 numbers:");

        
          
            for (int i = 0; i < 10; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                int num = scanner.nextInt();
                numberQueue.add(num);
            }

    
            int largestNumber = findLargestNumber(numberQueue);

            System.out.println("The largest number in the queue is: " + largestNumber);
        } 
        
    
    private static int findLargestNumber(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            throw new IllegalArgumentException("Queue is empty.");
        }

        Iterator<Integer> iterator = queue.iterator();
        int max = iterator.next(); 
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}
