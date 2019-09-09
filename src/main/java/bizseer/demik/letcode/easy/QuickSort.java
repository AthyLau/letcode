package bizseer.demik.letcode.easy;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/9/9 3:18 PM
 * @since JDK 1.8
 */
public class QuickSort {
    private static void quickSort(int a[], int start, int end) {
        if (start >= 0 && end <= a.length - 1 && start < end) {
            int low = start;
            int hign = end;
            //记录一个关键值 spiltKey
            int spiltKey = a[start];

            //遍历数组
            while (start < end) {
                //从后向前比较，直到遇到比spiltKey小的数
                while (start < end && a[end] >= spiltKey) end--;
                //交换位置
                a[start] = a[end];
                //从前向后比较，直到遇到有比spiltKey大的数
                while (start < end && a[start] <= spiltKey) start++;
                //交换位置
                a[end] = a[start];
            }

            /**
             * 此时第一次循环比较结束，关键值的位置已经确定了。
             * 左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
             */
            a[end] = spiltKey;
            //递归，再对左半部分排序
            quickSort(a, low, start - 1);
            //递归，再对右半部分排序
            quickSort(a, start + 1, hign);
        }
    }
}
