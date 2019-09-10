package bizseer.demik.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *
 * @author liubing
 * Date: 2019/9/10 12:22 PM
 * @since JDK 1.8
 */
public class KeyBoardRow500 {
    public static void main(String args[]){
        for (String s : findWords(new String[]{"asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew", "asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP", "zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew"})) {
            System.out.println(s);
        }
    }
    public static String[] findWord(String[] words){
        if (words == null || words.length == 0){
            return words;
        }
        String A = "qwertiuyop";
        String B = "asdfghjkl";
        String C = "zxcvbnm";
        Boolean flag;
        List<String> list = new ArrayList<>();
        String str;
        for (String word : words) {
            if (word.isEmpty()) {
                list.add(word);
            }else {
                flag = true;
                char[] chars = word.toLowerCase().toCharArray();
                if (A.contains(chars[0] + "")) {
                    str = A;
                } else if (B.contains(chars[0] + "")) {
                    str = B;
                } else {
                    str = C;
                }
                for (char aChar : chars) {
                    if (!str.contains(aChar + "")) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(word);
                }
            }
        }
        return list.toArray(new String[list.size()]);
    }
    public static String[] findWords(String[] words) {
        if (words == null || words.length == 0){
            return words;
        }
        String A = "qwertiuyop";
        String B = "asdfghjkl";
        String C = "zxcvbnm";
        String str;
        Boolean flag;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            if (word.isEmpty()) {
                stringBuilder.append("").append("-");
            }else {
                flag = true;
                char[] chars = word.toLowerCase().toCharArray();
                if (A.contains(chars[0] + "")) {
                    str = A;
                } else if (B.contains(chars[0] + "")) {
                    str = B;
                } else {
                    str = C;
                }
                for (char aChar : chars) {
                    if (!str.contains(aChar + "")) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    stringBuilder.append(word).append("-");
                }
            }
        }
        String ret = stringBuilder.toString();
        if (!ret.isEmpty()) {
            ret = ret.substring(0, ret.length()-1);
            return ret.split("-");
        }else {
            return new String[0];
        }

    }
}
