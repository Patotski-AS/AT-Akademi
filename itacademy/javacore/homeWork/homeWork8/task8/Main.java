package com.itacademy.javacore.homeWork.homeWork8.task8;



public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add(5);
        binaryTree.add(8);
        binaryTree.add(15);
        binaryTree.add(1);
        binaryTree.add(25);
        binaryTree.add(3);

        System.out.println(binaryTree.searchValue(15));
        System.out.println(binaryTree.searchValue(4));

        binaryTree.printSortTree();


    }
}
