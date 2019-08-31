package bizseer.demik.letcode.easy;

import java.util.Arrays;

/**
 * Function:给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 * <p>
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/8/31 3:49 PM
 * @since JDK 1.8
 */
public class SortArraySquare {

    public static void main(String args[]){
        int[] ret = sortedSquares1(new int[]{-9999,-999,9999,0,3,10});
        for (int r : ret) {
            System.out.print(r + " ");
        }
    }
    public static int[] sortedSquares1(int[] A) {
        int[] B = new int[10001];
        int[] ret = new int[A.length];
        for (int i : A) {
            B[Math.abs(i)]++;
        }
        for (int i = 0,j = 0; i < B.length; i++) {
            while (B[i]-->0){
                ret[j++] = i*i;
            }
        }
        return ret;
    }
    public static int[] sortedSquares2(int[] A){
        int[] ret = new int[A.length];
        int j = 0;
        for (int i : A) {
            ret[j++] = i*i;
        }
        Arrays.sort(ret);
        return ret;
    }
}
