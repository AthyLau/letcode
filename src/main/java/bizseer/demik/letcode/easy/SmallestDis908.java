package bizseer.demik.letcode.easy;

import java.util.Arrays;

/**
 * Function:最小差值
 * 给一个数组A[i],与定值k
 * 对A[i]进行加减 -k 与 k之间的数使得A数组的最大值最小值之间的差最小
 * 示例 1：
 * 输入：A = [1], K = 0
 * 输出：0
 * 解释：B = [1]
 * 示例 2：
 * 输入：A = [0,10], K = 2
 * 输出：6
 * 解释：B = [2,8]
 * 示例 3：
 * 输入：A = [1,3,6], K = 3
 * 输出：0
 * 解释：B = [3,3,3] 或 B = [4,4,4]
 * 提示：
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/smallest-range-i
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/9/23 4:46 PM
 * @since JDK 1.8
 */
public class SmallestDis908 {
    public static void main(String args[]) {
        // git 测试 dev-b
        System.out.println(smallestRangeI(new int[]{1}, 0));
    }

    private static int smallestRangeI(int[] A, int K) {
        int max = A[0];
        int min = A[0];
        for (int i : A) {
            if( i < min ){
                min = i;
            }
            if ( i > max ) {
                max = i;
            }
        }
        int dis = (max-K) - (min+K);
        return  dis <= 0 ? 0 : dis;
    }
}







