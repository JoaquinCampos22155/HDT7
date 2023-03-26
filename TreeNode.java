public class TreeNode {
    private int key;
    private String[] values;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int key, String[] values) {
        this.key = key;
        this.values = values;
        this.left = null;
        this.right = null;
    }

    public int getKey() {
        return key;
    }

    public String[] getValues() {
        return values;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
