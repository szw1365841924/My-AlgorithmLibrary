package datastructure;

public class DictionaryTree {
    private class TreeNode {
        boolean isEnd;
        TreeNode[] next;

        public TreeNode() {
            this.isEnd = false;
            this.next = new TreeNode[26];
        }
    }

    private TreeNode root;

    public DictionaryTree() {
        this.root = new TreeNode();
    }

    public void insert(String word) {
        TreeNode node = this.root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                node.next[index] = new TreeNode();
            }
            node = node.next[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TreeNode node = this.root;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                return false;
            }
            node = node.next[index];
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        TreeNode node = this.root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                return false;
            }
            node = node.next[index];
        }
        return true;
    }
}
