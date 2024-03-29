package bizseer.demik.letcode.easy;

/**
 * Function:
 * 翻转一棵二叉树。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 *      4
 *    /   \
 *   2     7
 *  / \    / \
 * 1   3  6   9
 * 输出：
 * <p>
 *         4
 *       /   \
 *     7      2
 *    / \    / \
 *   9   6  3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 * <p>
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/invert-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/8/30 7:14 PM
 * @since JDK 1.8
 */
public class OverturnBinaryTree {

    public static void main(String args[]){

    }
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode t = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(t);
        return root;
    }
}


