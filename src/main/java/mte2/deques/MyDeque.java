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
    @Override
    // ... for size ...
    public int size() {
        return list.size();
    }

    // ... for iterator ...
    public E Iterator {
        
    }

    public static void main(String[] args) { 
    MyDeque yep = new MyDeque<>();
    yep.enqueueBack(2);
    yep.enqueueBack(3);
    System.out.println(yep.size());
        // ...
    }
}