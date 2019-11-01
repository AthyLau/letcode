package bizseer.demik.letcode.easy;

/**
 * @author liubing
 * @dare: 2019/9/30 6:01 PM
 * @since JDK 1.8
 */
public class SingleBinTree965 {

    public static void main(String args[]){
        System.out.println(new SingleBinTree965().isUnivalTree(new TreeNode(0)));
    }

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (root.left != null && root.left.val != root.val) {
            return false;
        }
        if (root.right != null && root.right.val != root.val) {
            return false;
        }
        return isUnivalTree(root.right) && isUnivalTree(root.left);
    }
}
