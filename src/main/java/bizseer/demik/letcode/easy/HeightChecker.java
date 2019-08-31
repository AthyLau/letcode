package bizseer.demik.letcode.easy;

/**
 * Function:
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * <p>
 *      非递减数列  对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,1,4,2,1,3]
 * 输出：3
 * 解释：
 * 高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/8/30 7:23 PM
 * @since JDK 1.8
 */
public class HeightChecker {
    public static void main(String args[]) {

    }
    public int heightChecker(int[] heights) {
        int sum = 0;
        int[] ret = new int[101];
        for (int height : heights) {
            ret[height]++;
        }
        for (int i = 1, j = 0; i < ret.length; i++) {
            while (ret[i]-- > 0) {
                if (heights[j++] != i) sum++;
            }
        }
        return sum;
    }
}
