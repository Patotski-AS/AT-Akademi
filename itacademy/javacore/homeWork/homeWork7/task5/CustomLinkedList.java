package com.itacademy.javacore.homeWork.homeWork7.task5;

import java.util.Arrays;

public class CustomLinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int length;

    public CustomLinkedList() {
        this.last = new Node<T>(null, null);
        this.first = new Node<T>(null, last);
    }

    private static class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value, Node<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    public void add(T value) {
        Node<T> newNode = first;
        newNode.value = value;
        first = new Node<>(null, newNode);
        length++;
    }

    public void addNext(int value) {
        first = recursAddNext(first, value);
        length++;
    }


    private Node recursAddNext(Node node, int value) {
        if (node.next == null) {
            node.value=value;
            node.next=last=new Node<>(null,null);
            return node;
        }
         recursAddNext(node.next, value);
        return node;
    }


    public void remove() {
        Node<T> node = first.next.next;
        first = new Node<>(null, node);
        length--;
    }

    public T[] toArray() {
        T[] array = (T[]) new Object[length];
        Node<T> node = first;
        int count = 0;
        while (node.next != last) {
            node = node.next;
            array[count++] = node.value;
        }
        return array;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.toArray());
    }
}
