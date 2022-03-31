package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {
    @org.junit.jupiter.api.Test
    void singlyLinkedListTest() {
        //given
        SinglyLinkedList s = new SinglyLinkedList();
        int expected = 1;
        //when
        int actual = s.size();
        //then
        Assert.assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void testSinglyLinkedList() {
        //given
        int value = 10;
        SinglyLinkedList s = new SinglyLinkedList(value);
        //when
        int actual = s.get(0);
        //then
        Assert.assertEquals(value,actual);
    }

    @org.junit.jupiter.api.Test
    void add() {
        //given
        int value = 10;
        SinglyLinkedList s = new SinglyLinkedList(value);
        //when
        s.add(25);
        int actual = s.size();
        //then
        Assert.assertEquals(2,actual);
    }

    @org.junit.jupiter.api.Test
    void remove() {
        //given
        int value = 10;
        SinglyLinkedList s = new SinglyLinkedList(value);
        //when
        s.add(25);
        s.remove(1);
        int actual = s.size();
        //then
        Assert.assertEquals(1,actual);
    }

    @org.junit.jupiter.api.Test
    void size() {
        //given
        int value = 10;
        SinglyLinkedList s = new SinglyLinkedList(value);
        //when
        s.add(25);
        s.add(30);
        int actual = s.size();
        //then
        Assert.assertEquals(3,actual);
    }

    @org.junit.jupiter.api.Test
    void contains() {
        //given
        int value = 10;
        SinglyLinkedList s = new SinglyLinkedList(value);
        //when
        s.add(25);
        s.add(30);
        int actual = s.size();
        //then
        Assert.assertEquals(3,actual);
    }

    @org.junit.jupiter.api.Test
    void find() {

    }

    @org.junit.jupiter.api.Test
    void get() {
    }

    @org.junit.jupiter.api.Test
    void copy() {
    }

    @org.junit.jupiter.api.Test
    void sort() {
    }
}
