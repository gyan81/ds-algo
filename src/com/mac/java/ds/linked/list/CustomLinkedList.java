package com.mac.java.ds.linked.list;

import java.util.Iterator;
import java.util.Objects;

class GenericNode<T> {
    private T data;
    private GenericNode<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericNode<T> getNext() {
        return next;
    }

    public void setNext(GenericNode<T> next) {
        this.next = next;
    }
}

public class CustomLinkedList<T> implements Iterable<T> {
    private GenericNode<T> head = null;

    public void add(T data) {
        if (Objects.nonNull(head)) {
            GenericNode<T> next = head;
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(new GenericNode<>());
            next = next.getNext();
            next.setData(data);
            return;
        }
        head = new GenericNode<>();
        head.setData(data);
    }

    public GenericNode<T> getHead() {
        return head;
    }

    static class CustomIterator<T> implements Iterator<T> {
        private GenericNode<T> current;

        public CustomIterator(CustomLinkedList<T> current) {
            this.current = current.getHead();
        }

        @Override
        public boolean hasNext() {
            return Objects.nonNull(current);
        }

        @Override
        public T next() {
            T data = current.getData();
            current = current.getNext();
            return data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<>(this);
    }

    public static void main(String[] args) {
        CustomLinkedList<String> cll = new CustomLinkedList<>();

        cll.add("Aditya");
        cll.add("Aarti");
        cll.add("Balram");
        cll.add("Chanchal");
        cll.add("Pankaj");

        cll.forEach(System.out::println);
    }

}
