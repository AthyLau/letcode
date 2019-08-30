package bizseer.demik.letcode.easy;

/**
 * Function:
 *
 * @author liubing
 * Date: 2019/8/30 4:34 PM
 * @since JDK 1.8
 */
public class HanMingDistance {

    public static void main(String args[]){
        String a = Integer.toBinaryString(112);
        String b = Integer.toBinaryString(223);
        System.out.println(a);
        System.out.println(b);
        System.out.println(hammingDistance1(112,223));
        System.out.println(hammingDistance2(112,223));

        System.out.println();
        System.out.println();
        System.out.println(1&0);
    }
    public static int hammingDistance1(int x, int y) {
        int sum = 0;
        String strY = Integer.toBinaryString(y);
        char[] charX = Integer.toBinaryString(x).toCharArray();
        int zo = charX.length - strY.length();
        if(zo < 0){
            return hammingDistance1(y, x);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i < zo;i++){
            stringBuilder.append("0");
        }
        strY = stringBuilder.append(strY).toString();
        for(int i = 0;i < charX.length; i++){
            if(charX[i] != strY.charAt(i)){
                sum++;
            }
        }
        return sum;
    }
    public static int hammingDistance2(int x, int y){
        return Integer.bitCount(x ^ y);
    }

}
