package bizseer.demik.letcode.easy;

/**
 * Function:
 *
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度 3 。
 *
 * @author liubing
 * Date: 2019/8/31 2:55 PM
 * @since JDK 1.8
 */
public class BinaryTreeDeeper {

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(1);
        TreeNode ta = new TreeNode(3);
        TreeNode tb = new TreeNode(2);
        TreeNode tc = new TreeNode(5);
        t1.left = ta;
        t1.right = tb;
        tb.left = tc;
        System.out.println(maxDepth(t1));
    }
    private static int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return 1 + (l < r ? r : l);
        }
    }
}
