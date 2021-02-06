package datastructure;


/**
 * 颜色标记法, 用于迭代遍历二叉树
 */
public class ColorTreeNode {

    private TreeNode node;
    private String color;

    public ColorTreeNode() {
    }

    public ColorTreeNode(TreeNode node, String color) {
        this.node = node;
        this.color = color;
    }

    public TreeNode getNode() {
        return node;
    }

    public void setNode(TreeNode node) {
        this.node = node;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
