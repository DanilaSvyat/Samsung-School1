package com.samsung;

import com.samsung.test.BTree;

public class App {



    public static void main(String[] args) {
        int[] arr = new int[]{10, 25, 20, 6, 4, 8, 50, 30, 6};

        BTree tree = new BTree(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            tree.insertNode(tree, arr[i]);
        }
        tree.printBinaryTree(tree, 0);
    }
}
