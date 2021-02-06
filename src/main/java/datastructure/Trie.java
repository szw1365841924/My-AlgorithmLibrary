package datastructure;

/**
 * 字典树
 */
public class Trie {
    private boolean isEnd;
    private Trie[] next;

    public boolean isEnd() {
        return isEnd;
    }

    public void setEnd(boolean end) {
        isEnd = end;
    }

    public Trie[] getNext() {
        return next;
    }

    public void setNext(Trie[] next) {
        this.next = next;
    }

    public Trie() {
        this.isEnd = false;
        this.next = new Trie[26];
    }

    public void insert(String word) {
        Trie node = this;
        for (char c : word.toCharArray()) {
            int index = c - 'a';
            if (node.next[index] == null) {
                node.next[index] = new Trie();
            }
            node = node.next[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie node = this;
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
        Trie node = this;
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
