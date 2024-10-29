import java.util.LinkedList;

public class MyQueue<T> {
  private LinkedList<T> elements = new LinkedList<>();

  public void enqueue(T element) {
    elements.addLast(element);
  }

  public T dequeue() throws Exception {
    if(elements.isEmpty()) {
      throw new Exception("Queue is empty");
    }
    return elements.removeFirst();
  }

  public Boolean isEmpty() {
    return elements.isEmpty();
  }

  public int size() {
    return elements.size();
  }

  public T peek() throws Exception {
    if(elements.isEmpty()) {
      throw new Exception("Queue is empty");
    }
    return elements.getFirst();
  }
}
