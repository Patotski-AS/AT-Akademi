package com.itacademy.javacore.homeWork.homeWork8.task8;


// Реализовать класс бинарное поисковое дерево для целых чисел.
//         Внутри класса реализовать класс Node с полями Node left, Node right, int value.
//         Бинарное дерево будет хранить корень Node root.
//         Создать метод вставки элемента в дерево(чтобы сохранялось правило, что слева меньшие числа, а справа большие),
//         метод поиска элемента в дереве(возвращает true, если такой элемент есть) и метод обхода,
//         который выводит элементы в порядке возрастания.

public class BinaryTree {
    private Node root;

    public void add(int value) {
        root = addPassageTree(root, value);
    }

    public boolean searchValue(int value) {
        return searchPassageTree(root, value);
    }

    public void printSortTree() {
        printPassageTree(root);
    }

    private void printPassageTree(Node node) {
        if (node != null) {
            printPassageTree(node.left);
            System.out.print(node.value + " ");
            printPassageTree(node.right);
        }
    }

    private Node addPassageTree(Node node, int value) {
        if (node == null)
            return new Node(value);
        if (value < node.value)
            node.left = addPassageTree(node.left, value);
        else if (value > node.value)
            node.right = addPassageTree(node.right, value);
        else return node;
        return node;
    }

    private boolean searchPassageTree(Node node, int value) {
        if (node == null)
            return false;
        else if (node.value == value)
            return true;
        else
            return value < node.value ? searchPassageTree(node.right, value) :
                    searchPassageTree(node.right, value);
    }

    private class Node {
        Node left;
        Node right;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

}
