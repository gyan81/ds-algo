package com.mac.java.ds.linked.list;

import java.util.Objects;

class Node {
    private int element;
    private Node next;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        if (element != node.element) return false;
        return Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        int result = element;
        result = 31 * result + (next != null ? next.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + element +
                ", next=" + next +
                '}';
    }
}

public class LinkedList {

    private Node head = null;
    private int size = 0;

    public void insert(int element) {
        if (Objects.isNull(head)) {
            head = new Node();
            head.setElement(element);
        } else {
            Node temp = head;
            while (!Objects.isNull(temp.getNext())) {
                temp = temp.getNext();
            }
            temp.setNext(new Node());
            temp = temp.getNext();
            temp.setElement(element);
        }
        size++;
    }

    public void insertAtBegin(int element) {
        Node temp = new Node();
        temp.setElement(element);
        if (!Objects.isNull(head)) {
            temp.setNext(head);
        }
        head = temp;
        this.size++;
    }

    public void insertAtEnd(int element) {
        this.insert(element);
    }

    public void insert(int element, int n) {
        if (!Objects.isNull(head)) {
            int i = 1;
            Node temp = head;
            //20-30-40-50-60-70-80-90
            while (!Objects.isNull(temp) && i < n - 1) {
                temp = temp.getNext();
                i++;
            }
            if (!Objects.isNull(temp) && i == n - 1) {
                Node newNode = new Node();
                newNode.setElement(element);
                newNode.setNext(temp.getNext());
                temp.setNext(newNode);
                this.size++;
            }
        }
    }

    public int delete() {
        if (Objects.isNull(head)) {
            return -1;
        }
        this.size--;
        int x = head.getElement();
        head = head.getNext();
        return x;
    }

    public int deleteAtBegin() {
        return this.delete();
    }

    public int deleteAtEnd() {
        int result = -1;
        if (!Objects.isNull(head)) {
            if (Objects.isNull(head.getNext())) {
                result = head.getElement();
                head = null;
            } else {
                Node temp = head;
                while (!Objects.isNull(temp.getNext()) && !Objects.isNull(temp.getNext().getNext())) {
                    temp = temp.getNext();
                }
                result = !Objects.isNull(temp.getNext()) ? temp.getNext().getElement() : -1;
                temp.setNext(null);
            }
            this.size--;
        }
        return result;
    }

    public int delete(int n) {
        int result = -1;
        if (!Objects.isNull(head)) {
            int i = 1;
            Node temp = head;
            while (!Objects.isNull(temp) && i < n - 1) {
                temp = temp.getNext();
                i++;
            }
            if (i == n - 1 && !Objects.isNull(temp) && !Objects.isNull(temp.getNext())) {
                result = temp.getNext().getElement();
                temp.setNext(temp.getNext().getNext());
                this.size--;
            }
        }
        return result;
    }

    public void deleteAll() {
        this.size = 0;
        head = null;
    }

    public int getNthElement(int n) {
        int result = -1;
        if (!Objects.isNull(head)) {
            int i = 0;
            Node temp = head;
            while (!Objects.isNull(temp) && i < n) {
                result = temp.getElement();
                temp = temp.getNext();
                i++;
            }
            return i == n ? result : -1;
        }
        return result;
    }

    public int getNthElementFromLast(int n) {
        int result = -1;
        if (!Objects.isNull(head)) {
            Node temp = head, masterTemp = head;
            int i = 0;
            while (!Objects.isNull(temp) && i < n) {
                temp = temp.getNext();
                i++;
            }
            while (!Objects.isNull(masterTemp) && !Objects.isNull(temp)) {
                masterTemp = masterTemp.getNext();
                temp = temp.getNext();
            }
            return i == n && Objects.isNull(temp) && !Objects.isNull(masterTemp) ? masterTemp.getElement() : -1;
        }
        return result;
    }

    public void reverse() {
        if (!Objects.isNull(head)) {
            Node prev = null;
            while (!Objects.isNull(head)) {
                Node next = head.getNext();
                head.setNext(prev);
                prev = head;
                head = next;
            }
            head = prev;
        }
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                '}';
    }
}
