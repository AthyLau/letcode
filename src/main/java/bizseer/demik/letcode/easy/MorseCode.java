package bizseer.demik.letcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/23 7:50 PM
 * @since JDK 1.8
 */
public class MorseCode {
    public static void main(String args[]){

    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] str = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> ret = new HashSet<>();
        StringBuilder sb ;
        for(String word : words){
            sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                sb.append(str[word.charAt(i) - 'a']);
            }
            ret.add(sb.toString());
        }
        return ret.size();
    }
}
