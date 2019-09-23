package bizseer.demik.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:给定一个 N 叉树，找到其最大深度。
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *               1
 *          2    3    4
 *        5  6
 * 说明:
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 *
 *
 * @author liubing
 * Date: 2019/9/23 4:21 PM
 * @since JDK 1.8
 */
public class NTreeBiggestDeeper559 {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String args[]) {
        Node root = new Node(1,new ArrayList<Node>(){{
            add(new Node(2,new ArrayList<Node>(){{
                add(new Node(5, null));
                add(new Node(6, null));
            }}));
            add(new Node(3, null));
            add(new Node(4, null));
        }});
        System.out.println(maxDepth(root));
    }

    /**
     * 思路：本结点下的叶子节点遍历他们的最大深度，递归加循环
     * @param root
     * @return
     */
    public static int maxDepth(Node root) {
        int max = 0;
        if (root == null) {
            return 0;
        } else if (root.children == null) {
            return 1;
        } else {
            for (Node child : root.children) {
                int deeper = maxDepth(child);
                if (deeper > max) {
                    max = deeper;
                }
            }
        }
        return max + 1;
    }
}









