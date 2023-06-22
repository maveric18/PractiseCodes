package src.main.java.PG.Tree;

import java.util.ArrayList;

import static src.main.java.PG.Tree.TreeNode.newNode;

public class TreePractise {

    static int max = 0;
    public static int sumOfAllNodes(TreeNode node) {
        int sum = 0;
        if (node == null) {
            return 0;
        }
        if(node!=null){
            sum+=node.val;
        }
        int leftSum = sumOfAllNodes(node.left);
        int rightSum = sumOfAllNodes(node.right);
        return sum + leftSum + rightSum;
    }

    public static int maxNode(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.val > max){
            max = node.val;
        }
        maxNode(node.left);
        maxNode(node.right);
        return max;
    }

    public static boolean isIdentical(TreeNode A, TreeNode B){
        if(A ==null && B==null){
            return true;
        }
        if(A==null || B==null){
            return false;
        }
        if(A.val != B.val){
            return false;
        }
        boolean left = isIdentical(A.left,B.left);
        boolean right = isIdentical(A.right, B.right);

        return (left && right);
    }

    public static int findK(TreeNode node,int k){
        if(node==null){
            return 0;
        }
        if(k<node.val){
            findK(node.left,k);
        }else if (k>node.val){
            findK(node.right,k);
        }else {
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        TreeNode root = newNode(17);
        /*root.left = newNode(20);
        root.right = newNode(3);
        root.left.right = newNode(5);
        root.right.left = newNode(13);
        root.right.right = newNode(12);
        root.right.left.left = newNode(10);
        root.right.left.right = newNode(15);
        root.right.right.right = newNode(5);*/
        root.left = newNode(26);
        root.left.left = newNode(37);
        root.right = newNode(42);

        System.out.println(sumOfAllNodes(root));
        System.out.println(maxNode(root));

        TreeNode A = newNode(5);
        A.left = newNode(10);
        A.right = newNode(7);
        A.left.left = newNode(3);

        TreeNode B = newNode(5);
        B.left = newNode(10);
        B.right = newNode(7);
        B.left.left = newNode(3);
        System.out.println(isIdentical(A,B));

        TreeNode K = newNode(6);
        K.left = newNode(2);
        K.right = newNode(7);
        K.left.left = newNode(1);
        K.left.right = newNode(5);
        System.out.println(findK(K,7));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);list.add(10);list.add(19);list.add(14);list.add(18);
        list.add(12);list.add(25);list.add(28);
        int first = 0;
        int second = 0;
        for(int i=0;i<list.size()-2;i++){
            if(first == 0 && list.get(i) > list.get(i+1)){
                first = list.get(i);
            }else if(first != 0 && list.get(i)>list.get(i+1)){
                second = list.get(i+1);
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(first<second){
            res.add(first);
            res.add(second);
        }else{
            res.add(second);
            res.add(first);
        }
        System.out.println("---------------"+res.toString());
    }
}
