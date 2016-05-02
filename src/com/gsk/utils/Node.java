package com.gsk.utils;

/**
 * Created by gaurav on 5/1/16.
 */
public class Node<T> {
    T object;
    Node next;

    public Node(T object) {
        this.object = object;
    }

    public T get() {
        return object;
    }

    public void set(T object) {
        this.object = object;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
