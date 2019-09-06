package bizseer.demik.letcode.easy;

/**
 * Function:
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * <p>
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 * <p>
 * 输入：["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/9/6 1:54 PM
 * @since JDK 1.8
 */
public class ReserveString344 {
    public static void main(String args[]) {
        for (char c :reverseString(new String("123456").toCharArray())) {
            System.out.println(c);
        }
    }

    public static char[] reverseString(char[] s) {
        if ( s!=null && s.length > 1) {
            int len = s.length;
            for (int i = 0; i < len / 2; i++) {
                char temp = s[i];
                s[i] = s[len - 1 - i];
                s[len - 1 - i] = temp;
            }
        }
        return s;
    }
}
