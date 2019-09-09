package bizseer.demik.letcode.easy;

/**
 * Function:
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-words-in-a-string-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author liubing
 * Date: 2019/9/6 2:05 PM
 * @since JDK 1.8
 */
public class ReserveWords557 {

    public static void main(String args[]){
        System.out.println(reverseWords("123 45 67 89"));
    }
    private static String reverseWords(String s) {
        if(s == null){
            return null;
        }else if(s.length() == 0){
            return "";
        }
        String[] strs = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String str: strs) {
            stringBuilder.append(reverseString(str.toCharArray())).append(" ");
        }
        return stringBuilder.toString().substring(0, s.length());
    }
    private static String reverseString(char[] s) {
        if ( s!=null && s.length > 1) {
            int len = s.length;
            for (int i = 0; i < len / 2; i++) {
                char temp = s[i];
                s[i] = s[len - 1 - i];
                s[len - 1 - i] = temp;
            }
            return new String(s);
        }
        return null;
    }
}
