public class Main
{
  public static void main(String[] args) throws Exception {
    MyQueue<Integer> intQueue = new MyQueue<>();
    intQueue.enqueue(1);
    intQueue.enqueue(2);
    intQueue.enqueue(3);

    System.out.println("Size of queue: " + intQueue.size()); // Output: 3
    System.out.println("First element: " + intQueue.peek());  // Output: 1

    System.out.println("Removed element: " + intQueue.dequeue()); // Output: 1
    System.out.println("Removed element: " + intQueue.dequeue()); // Output: 2
    System.out.println("Size of queue: " + intQueue.size());
  }
}