package bizseer.demik.letcode.easy;

/**
 * Function:
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * 注意:
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/number-complement
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/9/4 1:45 PM
 * @since JDK 1.8
 */
public class Complement476 {
    public static void main(String args[]){
        System.out.println(method2(5));
    }
    private static int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < binary.length(); i++){
            if (binary.charAt(i) == '0') {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }

    /**
     * 感觉这代码像是凑的呢。。。
     * @param num num
     * @return int
     */
    private static int method2(int num){
        System.out.println("num : " + num + " "+Integer.toBinaryString(num));
        int temp = 1;
        while (temp <= num){
            temp <<= 1;
            System.out.println("temp: "+ temp +" "+Integer.toBinaryString(temp));
            temp++;
            System.out.println("temp: "+ temp +" "+Integer.toBinaryString(temp));
        }
        return num ^ temp;
    }
}
