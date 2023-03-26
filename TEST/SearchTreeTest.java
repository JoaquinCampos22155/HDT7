import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SearchTreeTest {
    @Test
    void testSearch() {
        BinaryTree tree = new BinaryTree(new TreeNode(5, new String[]{"five"}));
        tree.getRoot().setLeft(new TreeNode(3, new String[]{"three"}));
        tree.getRoot().setRight(new TreeNode(7, new String[]{"seven"}));
        tree.getRoot().getLeft().setLeft(new TreeNode(2, new String[]{"two"}));
        tree.getRoot().getLeft().setRight(new TreeNode(4, new String[]{"four"}));
        tree.getRoot().getRight().setLeft(new TreeNode(6, new String[]{"six"}));
        tree.getRoot().getRight().setRight(new TreeNode(8, new String[]{"eight"}));

        assertEquals("five", SearchTree.search(tree, 5));
        assertEquals("three", SearchTree.search(tree, 3));
        assertEquals("seven", SearchTree.search(tree, 7));
        assertEquals("two", SearchTree.search(tree, 2));
        assertEquals("four", SearchTree.search(tree, 4));
        assertEquals("six", SearchTree.search(tree, 6));
        assertEquals("eight", SearchTree.search(tree, 8));
        assertEquals("No se encontró la clave 1", SearchTree.search(tree, 1));
    }
}
