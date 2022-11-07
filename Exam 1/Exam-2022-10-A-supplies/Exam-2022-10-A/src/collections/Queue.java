package collections;

import java.util.ArrayList;

public class Queue<E> {
    private ArrayList<E> elements;

    public Queue(){
        this.elements   = new ArrayList<>();
    }

    public int size(){
        return this.elements.size();
    }

    public void enqueue(E element){
        this.elements.add(element);
    }

    public E dequeue(){
        // We should check if elements is empty and raise an Exception if it's the case
        // As we've not learned this yet, I'll just return "null"

        if (this.elements.size() == 0) return null;
        return this.elements.remove(0);
    }

    // Doesn't appear in the UML Diagram, but appears in BasicQueueTest.java
    public boolean isEmpty(){
        return this.elements.isEmpty();
    }
}
