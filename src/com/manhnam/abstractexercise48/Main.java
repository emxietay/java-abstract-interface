package com.manhnam.abstractexercise48;

public class Main {
    public static void main(String[] args) {
        SearchTree newTree = new SearchTree(new Node("Nam"));
        newTree.addItem(new Node("6"));
        newTree.addItem(new Node("1"));
        newTree.addItem(new Node("2"));
        newTree.addItem(new Node("6"));
        newTree.addItem(new Node("8"));
        newTree.addItem(new Node("16"));
        newTree.addItem(new Node("2"));
        newTree.addItem(new Node("6"));
        newTree.addItem(new Node("8"));
        newTree.addItem(new Node("16"));
        newTree.traverse(newTree.getRoot());

    }
}
