package bizseer.demik.letcode.easy;

import java.util.Stack;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/27 7:01 PM
 * @since JDK 1.8
 */
public class KuoHaoStack {

    public static void main(String args[]){
        isValid("(){}[]");
    }

    public static boolean isValid(String s) {
        if(s == null || s.isEmpty()){
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            char newChar = s.charAt(i);
            char last = stack.size() != 0 ? stack.elementAt(stack.size()-1) : 0;
            if ( last+1 == newChar || last+2 == newChar ){
                stack.pop();
            }else {
                stack.add(newChar);
            }
        }
        return stack.size() == 0;
    }
}
