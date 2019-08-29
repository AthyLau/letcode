package bizseer.demik.letcode.easy;

/**
 * Function:    错误的集合
 * <p>
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * 输入: nums = [1,2,2,4]         0+1-2+2-4 = -3          [1、2、3、4、4、6、7]     1-2+3-4+6-4+7 = 7       1-2+3-4+4-6+7 = 3
 * 输出: [2,3]                    0+1-2+3-4 = -2                                  1-2+4-3+5-6+7 = 4
 *                              1、 2、3、 4、5、 6、7        size为奇 +1/2为最后结果
 *                              1、-1、2、-2、3、-3、4        size为偶 /2取反为最后结果
 *
 *                              1+2+3+4+5+6+7 = 32
 *                              1+2+3+4+5+6+4+8 = 40        40 -  37 = 7 - 4
 *                              NO NO NO thinkings is wrong
 * @author liubing
 * Date: 2019/8/27 7:20 PM
 * @since JDK 1.8
 */
public class WrongCollection {

    public static void main(String args[]) {

    }

    public int[] findErrorNums(int[] nums) {
        int[] cor = new int[10002];
        int i = 0,j = 0;
        for (int num : nums) {
            cor[num]++;
            if(cor[num] == 2){
                i = num;
            }
        }
        for(int k = 0; k < cor.length; k++){
            if (cor[k] == 0 && k != 0) {
                j = k;
            }
            break;
        }
        return new int[]{i,j};
    }
}
