package collections;

public class QueueMain {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");

        System.out.println("size: " + q.size());
        
        System.out.println("q: ");
        System.out.println("-> " + q.dequeue());
        System.out.println("-> " + q.dequeue());
        System.out.println("-> " + q.dequeue());
        System.out.println("-> " + q.dequeue());

        System.out.println("size: " + q.size());
    }
}
