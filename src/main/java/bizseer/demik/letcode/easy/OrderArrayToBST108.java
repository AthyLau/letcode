package bizseer.demik.letcode.easy;

import java.util.Arrays;

/**
 * Function:
 * <p>
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * <p>
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * <p>
 * 示例:
 * <p>
 * 给定有序数组: [-10,-3,0,5,9],
 * <p>
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 * <p>
 *                       0
 *                      / \
 *                    -3   9
 *                    /   /
 *                  -10  5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * [-10,-3,0,5,9]
 *          0
 *
 *      -3      5
 *
 *   -10  n   n   9
 * @author liubing
 * Date: 2019/9/12 11:08 AM
 * @since JDK 1.8
 */
public class OrderArrayToBST108 {

    public static void main(String args[]){
        int[] nums = {12,41,16,32,23,   45   ,17,31,12,76,18};
        int mid = nums.length/2;
        for (int i : Arrays.copyOfRange(nums, 0, mid)) {
            System.out.print(i+"  ");
        }
        System.out.println();
        for (int i : Arrays.copyOfRange(nums, mid+1, nums.length)) {
            System.out.print(i+"  ");
        }
        nums = new int[]{-10, -3, 0, 9, 5};
        TreeNode treeNode = sortedArrayToBST(nums);
    }

    /**
     * 缺点：时间都浪费在分割数组上了，最好是直接来两个变量，left跟right跟随nums一块往下传，nums不变。
     * @param nums
     * @return
     */
    public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0){
            return null;
        }
        int len = nums.length;
        if(len == 1){
            return new TreeNode(nums[0]);
        }
        int mid = len/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid+1, len));
        return root;
    }

}
