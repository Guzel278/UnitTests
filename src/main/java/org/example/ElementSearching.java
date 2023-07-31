package org.example;

public class ElementSearching {
    // элемент дерева

    public static class Node {
        public final int key;
        public Node left;
        public Node right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    public static Node search(int key, Node root) {
        if (root == null) return null;
        if (key == root.key) return root;
        return search(key, key > root.key ? root.right : root.left);
    }
}
