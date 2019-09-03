package bizseer.demik.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:N叉树的前序遍历
 *
 * @author liubing
 * Date: 2019/9/3 10:29 AM
 * @since JDK 1.8
 */
public class PreOrderTree {

    public static void main(String args[]){

    }
    public List<Integer> preorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }else if(root.children != null){
            return new ArrayList<Integer>(){{
                add(root.val);
                for (Node child : root.children) {
                    addAll(preorder(child));
                };
            }};
        }else {
            return new ArrayList<Integer>(){{
                add(root.val);
            }};
        }
    }
    public List<Integer> postorder(Node root) {
        if(root == null){
            return new ArrayList<>();
        }else if(root.children != null){
            return new ArrayList<Integer>(){{
                for (Node child : root.children) {
                    addAll(postorder(child));
                };
                add(root.val);
            }};
        }else {
            return new ArrayList<Integer>(){{
                add(root.val);
            }};
        }
    }
}
