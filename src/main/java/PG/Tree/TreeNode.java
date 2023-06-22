package src.main.java.PG.Tree;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    static TreeNode newNode(int data) {
        TreeNode temp = new TreeNode();
        temp.val = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
}
