package br.com.ricas.exercises;

import br.com.ricas.exercises.model.TreeNode;

public class InvertBinaryTree {

    /*         4,
          2         7

       1   3      6   9

     */
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return root;



        TreeNode tmp = root.left; // 2
        root.left = root.right; // 7
        root.right = tmp; // 2

        invertTree(root.left);
        invertTree(root.right);




        return root;
    }
}


