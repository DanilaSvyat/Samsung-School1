package com.samsung.test;

public class BTree {

    private int value;
    private BTree lchild;
    private BTree rchild;

    public BTree(int value) {
        this.value = value;
        this.lchild = null;
        this.rchild = null;
    }

    public BTree insertNode(BTree node, int value) {

        if (node == null) {
            node = new BTree(value);
            return node;
        }

        if (node.value > value) {
            if (node.lchild == null) {
                return node.lchild = new BTree(value);
            } else {
                return insertNode(node.lchild, value);
            }
        } else {
            if (node.value < value) {
                if (node.rchild == null) {
                    return node.rchild = new BTree(value);
                } else {
                    return insertNode(node.rchild, value);
                }
            }
        }
        return null;
    }

    public void printBinaryTree(BTree node, int level) {
        if (node != null) {
            printBinaryTree(node.lchild, level + 1);
            for (int i = 0; i < level; i++)
                System.out.print("   ");//чем ниже уровень, тем отступ больше
            System.out.println(node.value);
            printBinaryTree(node.rchild, level + 1);
        }
    }
}
