package bizseer.demik.letcode.easy;

import java.util.Random;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 返回重复了 N 次的那个元素。
 * 示例 1：
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 * 提示：
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * @dare: 2019/9/24 10:09 AM
 * @since JDK 1.8
 */
public class GetRepeatedTime961 {

    public static void main(String args[]){
//        System.out.println(repeatedNTimes(new int[]{1,6,6,9}));
        System.out.println(repeatNTimes(new int[]{1,5,2,5,3,5,4,5}));
    }
    //这个不对，这是求一个长度为n的数组中出现次数大于n/2次的数字
    public static int repeatedNTimes(int[] A) {
        int value = Integer.MAX_VALUE;
        int count = 0;
        for (int i : A) {
            if (value == Integer.MAX_VALUE) {
                value = i;
                count = 1;
            } else if (value == i) {
                count++;
            } else if (count != 0) {
                count--;
                if (count==0) {
                    value = i;
                    count++;
                }
            }
        }
        return value;
    }
    public static int repeatNTimes(int[] A){
        int[] ints = new int[10000];
        int ret = 0;
        for (int i : A) {
            if ( ++ints[i] ==  A.length/2) {
                ret = i;
            }
        }
        return ret;
    }
}
