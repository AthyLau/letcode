package bizseer.demik.letcode.easy;


/**
 * Function:/**
 * Definition for a binary tree node.
 *
 * @author liubing
 * Date:2019/8/26 2:34PM
 * @since JDK1.8
 */

public class MergeBinTree {

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(1);
        TreeNode ta = new TreeNode(3);
        TreeNode tb = new TreeNode(2);
        TreeNode tc = new TreeNode(5);
        t1.left = ta;
        t1.right = tb;
        tb.left = tc;

        TreeNode t2 = new TreeNode(2);
        TreeNode td = new TreeNode(1);
        TreeNode te = new TreeNode(3);
        TreeNode tf = new TreeNode(4);
        TreeNode tg = new TreeNode(7);
        t2.left = td;
        t2.right = te;
        td.right = tf;
        te.right = tg;

        new MergeBinTree().mergeTrees(t1,t2);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }else if(t2 ==null){
            return t1;
        }else {
            TreeNode treeNode = new TreeNode(t1.val+t2.val);
            treeNode.left = mergeTrees(t1.left,t2.left);
            treeNode.right = mergeTrees(t1.right,t2.right);
            return treeNode;
        }
    }

}

