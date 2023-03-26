public class BinaryTree {
    private TreeNode root;

    public BinaryTree(MyHashMap hashMap) {
        root = null;
        for (int i = 1; i <= hashMap.getSize(); i++) {
            root = insert(root, i, hashMap.getValue(i));
        }
    }

    private TreeNode insert(TreeNode node, int key, String[] value) {
        if (node == null) {
            node = new TreeNode(key, value);
        } else {
            if (key < node.getKey()) {
                node.setLeft(insert(node.getLeft(), key, value));
            } else {
                node.setRight(insert(node.getRight(), key, value));
            }
        }

        return node;
    }

    public TreeNode getRoot() {
        return root;
    }
}
