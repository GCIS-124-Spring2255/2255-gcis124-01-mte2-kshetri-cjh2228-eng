// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.LinkedList;
import java.util.Iterator;


public class MyDeque<E> implements Deque<E> {
    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    @Override
    public void enqueueFront(E element) {
        list.addFirst(element);
    }

    @Override
    public void enqueueBack(E element) {
        list.addLast(element);
    }

    @Override
    public E dequeueFront() {
        return list.removeFirst();
    }

    @Override
    public E dequeueBack() {
        return list.removeLast();
    }

    // ... for size ...
    public int size() {
        return list.size();
    }

    // ... for iterator ...
    


    public static void main(String[] args) { 

        // ...
    }
}