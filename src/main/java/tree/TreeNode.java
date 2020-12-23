package tree;

/**
 * @description: 树的定义
 * @author: Will_Lee
 * @create: 2020/12/21 20:18
 **/


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        treeNode.left.left = new TreeNode(5);
        treeNode.left.right = new TreeNode(7);
        System.out.println("前序遍历");
        preOrderVisit(treeNode);
        System.out.println("中序遍历");
        midOrderVisit(treeNode);
        System.out.println("后序遍历");
        backOrderVisit(treeNode);
    }

    public static void preOrderVisit(TreeNode tree) {
        if (tree == null) return;
        System.out.println(tree.val);
        preOrderVisit(tree.left);
        preOrderVisit(tree.right);
    }

    public static void midOrderVisit(TreeNode treeNode) {
        if (treeNode == null) return;
        midOrderVisit(treeNode.left);
        System.out.println(treeNode.val);
        midOrderVisit(treeNode.right);
    }

    public static void backOrderVisit(TreeNode treeNode) {
        if (treeNode == null)return;
        backOrderVisit(treeNode.left);
        backOrderVisit(treeNode.right);
        System.out.println(treeNode.val);
    }

}
