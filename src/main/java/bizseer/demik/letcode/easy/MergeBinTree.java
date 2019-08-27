package bizseer.demik.letcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

        List<String> list1 = new ArrayList<String>(){{
            add("1-aa");
            add("1-bb");
            add("1-cc");
        }};

        List<String> list2 = new ArrayList<String>(){{
            add("2-aa");
            add("2-bb");
            add("2-cc");
        }};
        HashMap<String, String> hs = new HashMap<String, String>() {{
            for (int i = 0; i < list1.size(); i++) {
                put(list1.get(i), list2.get(i));
            }
        }};

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
        merge(t1,t2);
        return t1;
    }
    public void merge(TreeNode t1, TreeNode t2){
        if(!(t1==null && t2==null)){
            if(t1 == null){
                t1 = t2;
            }
            t1.val = t2 == null ? t1.val : t1.val+t2.val;
            if(t2 != null){
                merge(t1.right,t2.right);
                merge(t1.left,t2.left);
            }else{
                merge(t1.right,null);
                merge(t1.left,null);
            }
        }
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}