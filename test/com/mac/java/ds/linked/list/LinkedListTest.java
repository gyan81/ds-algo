package com.mac.java.ds.linked.list;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class LinkedListTest {

    private static LinkedList linkedList = null;

    @BeforeAll
    static void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    @Order(10)
    void deleteFailedScenario() {
        assertEquals(-1, linkedList.delete());
    }

    @Test
    @Order(20)
    void insert() {
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.insert(50);
        linkedList.insert(60);
        linkedList.insert(70);
        linkedList.insert(80);
        linkedList.insert(90);
        assertEquals(9, linkedList.getSize());
    }

    @Test
    @Order(30)
    void delete() {
        assertEquals(10, linkedList.deleteAtBegin());
    }

    @Test
    @Order(31)
    void deleteAtEnd() {
        linkedList.insertAtEnd(100);
        assertEquals(100, linkedList.deleteAtEnd());
    }

    @Test
    @Order(32)
    void deleteAtSpecificPosition() {
        linkedList.insert(61, 6);
        assertEquals(61, linkedList.getNthElement(6));
        assertEquals(61, linkedList.delete(6));
    }

    @Test
    @Order(40)
    void getNthElement() {
        assertEquals(60, linkedList.getNthElement(5));
    }

    @Test
    @Order(41)
    void getNthElementFailScenario() {
        assertEquals(-1, linkedList.getNthElement(9));
    }

    @Test
    @Order(50)
    void getNthElementFromLast() {
        assertEquals(80, linkedList.getNthElementFromLast(2));
    }

    @Test
    @Order(51)
    void getNthElementFromLastFailedScenario() {
//        System.out.println(linkedList);
        assertEquals(-1, linkedList.getNthElementFromLast(9));
    }


    @Test
    @Order(60)
    void insertAtBegin() {
        linkedList.insertAtBegin(10);
        assertEquals(10, linkedList.getNthElement(1));
    }

    @Test
    @Order(61)
    void insertAtEnd() {
        linkedList.insertAtEnd(99);
        assertEquals(99, linkedList.getNthElement(linkedList.getSize()));
    }

    @Test
    @Order(62)
    void insertInPosition() {
        linkedList.insert(61, 7);
        assertEquals(61, linkedList.getNthElement(7));
    }

    @Test
    @Order(90)
    void getSize() {
        assertEquals(11, linkedList.getSize());
    }

    @Test
    @Order(Integer.MAX_VALUE - 1)
    void reverse() {
        linkedList.reverse();
        System.out.println(linkedList);
    }

    @Test
    @Order(Integer.MAX_VALUE)
    void deleteAll() {
        linkedList.deleteAll();
        assertEquals(0, linkedList.getSize());
    }

}