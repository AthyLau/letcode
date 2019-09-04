package bizseer.demik.letcode.easy;

import java.util.Arrays;

/**
 * Function:
 * 我们把符合下列属性的数组 A 称作山脉：
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,0]
 * 输出：1
 * 提示：
 * <p>
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A 是如上定义的山脉
 *
 * @author liubing
 * Date: 2019/9/3 5:28 PM
 * @since JDK 1.8
 */
public class MountainTopIndex {

    public static void main(String args[]){
        System.out.println(peakIndexInMountainArray2(new int[]{0,5,1,0}));
    }
    public int peakIndexInMountainArray1(int[] A) {
        int k = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i] < A[i-1]){
                k = i - 1;
                break;
            }
        }
        return k;
    }
    public static int peakIndexInMountainArray2(int[] A) {
        int mid = A.length/2;
        if(A[mid-1] < A[mid] && A[mid] > A[mid+1]){
            return mid;
        }else if(A[mid-1] < A[mid] && A[mid] < A[mid+1]){
            return peakIndexInMountainArray2(Arrays.copyOfRange(A,mid,A.length));
        }else{
            return peakIndexInMountainArray2(Arrays.copyOfRange(A,0,mid+1));
        }
    }
}
