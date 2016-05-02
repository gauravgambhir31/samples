package com.gsk;

import com.gsk.utils.Node;


public class LinkedList<T> {
    Node<T> start = null;
    Node<T> next = null;

    public void add(T s){
        Node<T> node = new Node(s);
        if(null == start){
            start = next = node ;
        }else{
            next.setNext(node);
            next = node;
        }
    }

    public void print() {
        if (start != null) {
            System.out.print(start.get());
        }

        while (start.getNext() != null) {
            System.out.print("---->");
            start = start.getNext();
            System.out.print(start.get());
        }
    }


    public boolean isLoopPresent(){
        while (start.getNext() != null){

        }
        return false;
    }


    public static void main(String[] args) {
	// write your code here
        LinkedList<String> list = new LinkedList();
        for(int i = 1 ; i<=10; i++){
            list.add("Element-"+i);
        }
        list.print();
        System.out.println();
        LinkedList<Integer> iList = new LinkedList();
        for(int i = 1 ; i<=10; i++){
            iList.add(i);
        }
        iList.print();
    }
}
