public class SearchTree {
    public static String search(BinaryTree binaryTree, int key) {
        TreeNode node = search(binaryTree.getRoot(), key);

        if (node == null) {
            return "No se encontró la clave " + key;
        } else {
            return node.getValues()[key];
        }
    }

    private static TreeNode search(TreeNode node, int key) {
        if (node == null || node.getKey() == key) {
            return node;
        } else if (key < node.getKey()) {
            return search(node.getLeft(), key);
        } else {
            return search(node.getRight(), key);
        }
    }
}
