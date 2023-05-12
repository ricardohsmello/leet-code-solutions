package exercises;

import br.com.ricas.exercises.InvertBinaryTree;
import br.com.ricas.exercises.model.TreeNode;
import org.junit.jupiter.api.Test;

public class InvertBinaryTreeTest {

    @Test
    public void test() {
        //Input: root = [4,2,7,1,3,6,9]
        //Output: [4,7,2,9,6,3,1]
        TreeNode node = new TreeNode(4);
        node.left = new TreeNode(2);
        node.right = new TreeNode(7);
        node.left.left = new TreeNode(1);
        node.left.right = new TreeNode(3);
        node.right.left = new TreeNode(6);
        node.right.right = new TreeNode(9);

        InvertBinaryTree invertBinaryTreeTest = new InvertBinaryTree();
        TreeNode treeNode = invertBinaryTreeTest.invertTree(node);
        System.out.println(treeNode);
    }
}
