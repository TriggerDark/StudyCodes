package exercise.bt;

/**
 * @author SuperStar
 */

public class BinaryTree {
    public TreeNode root;
    public long size;

    public Boolean addTreeNode(Integer data) {

        if (null == root) {
            root = new TreeNode(data);
            return true;
        }
        // 即将被插入的数据
        TreeNode treeNode = new TreeNode(data);
        TreeNode currentNode = root;
        TreeNode parentNode;

        while (true) {
            // 保存父节点
            parentNode = currentNode;
            // 插入的数据比父节点小
            if (currentNode.data > data) {
                currentNode = currentNode.left;
                // 当前父节点的左子节点为空
                if (null == currentNode) {
                    parentNode.left = treeNode;
                    treeNode.parent = parentNode;
                    return true;
                }
                // 插入的数据比父节点大
            } else if (currentNode.data < data) {
                currentNode = currentNode.right;
                // 当前父节点的右子节点为空
                if (null == currentNode) {
                    parentNode.right = treeNode;
                    treeNode.parent = parentNode;
                    return true;
                }
            } else {
                return false;
            }
        }
    }
    /**通过中序遍历，输出结点值*/
    public void medOrderMethodOne(TreeNode treeNode){
        if (null != treeNode) {
            if (null != treeNode.left) {
                medOrderMethodOne(treeNode.left);
            }
            System.out.print(treeNode.data + " ");
            if (null != treeNode.right) {
                medOrderMethodOne(treeNode.right);
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        int[] arr = {63, 55, 90, 42, 58, 70, 10, 45, 67, 83};
        for (int i = 0; i < arr.length; i++) {
            binaryTree.addTreeNode(arr[i]);
        }
        binaryTree.medOrderMethodOne(binaryTree.root);
    }
}