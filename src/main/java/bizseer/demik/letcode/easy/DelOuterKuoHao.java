package bizseer.demik.letcode.easy;

import java.util.Stack;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/22 5:09 PM
 * @since JDK 1.8
 */
public class DelOuterKuoHao {

    public static void main(String args[]){
        String s = "(((())))(())(())(())";
        System.out.println(removeOuterKuohao1(s));
    }
    public static String removeOuterKuohao(String s){
        StringBuilder ret = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(stack.size() > 0 && c==')'){
                stack.pop();
                if(stack.size() != 0){
                    ret.append(c);
                }
            }else {
                if(stack.size() != 0){
                    ret.append(c);
                }
                stack.add(c);
            }
        }
        return ret.toString();
    }
    public static String removeOuterKuohao1(String s){
        StringBuilder ret = new StringBuilder();
        int count = 0;
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(count > 0 && c==')'){
                count--;
                if(count != 0){
                    ret.append(c);
                }
            }else {
                if(count != 0){
                    ret.append(c);
                }
                count++;
            }
        }
        return ret.toString();
    }
}
