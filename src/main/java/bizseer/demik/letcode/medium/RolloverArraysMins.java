package bizseer.demik.letcode.medium;

/**
 * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
 * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
 * 若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组 [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
 *
 * 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。请你找出并返回数组中的 最小元素 。
 *
 * 示例 1：
 *
 * 输入：nums = [3,4,5,1,2]
 * 输出：1
 * 解释：原数组为 [1,2,3,4,5] ，旋转 3 次得到输入数组。
 * 示例 2：
 *
 * 输入：nums = [4,5,6,7,0,1,2]
 * 输出：0
 * 解释：原数组为 [0,1,2,4,5,6,7] ，旋转 4 次得到输入数组。
 * 示例 3：
 *
 * 输入：nums = [11,13,15,17]
 * 输出：11
 * 解释：原数组为 [11,13,15,17] ，旋转 4 次得到输入数组。
 *  
 * 提示：
 *
 * n == nums.length
 * 1 <= n <= 5000
 * -5000 <= nums[i] <= 5000
 * nums 中的所有整数 互不相同
 * nums 原来是一个升序排序的数组，并进行了 1 至 n 次旋转
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * 思路1：从后往前找，找到第一个比 nums[0] 大的元素 nums[x]， 则 nums[x + 1] 就是要找的元素
 * 思路2：从后往前找，找到第一个数 nums[x] 大于 nums[x + 1] ，则 nums[x + 1] 就是要找的元素
 *
 *
 * @author AthyLau
 **/
public class RolloverArraysMins {
    public static void main(String[] args) {

    }

    /**
     * 互相不重复的数字 中等难度
     */
    public int findMin(int[] nums) {
        int firstNum = nums[0];
        if (nums.length == 1) {
            return firstNum;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >= firstNum) {
                if (i == nums.length - 1) {
                    break;
                }
                firstNum = nums[i + 1];
                break;
            }
        }
        return firstNum;
    }

    /**
     * 在数字重复的情况下 , 升级版本 困难程度
     */
    public int findMinNewVersion(int[] nums) {
        int firstNum = nums[0];
        if (nums.length == 1) {
            return firstNum;
        }
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                firstNum = nums[i];
                break;
            }
        }
        return firstNum;
    }
}
