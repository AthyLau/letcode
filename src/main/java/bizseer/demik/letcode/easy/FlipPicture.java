package bizseer.demik.letcode.easy;

/**
 * Function:
 *
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * 示例 1:
 *
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 * 示例 2:
 *
 * 输入: [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
 * 输出: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 * 解释: 首先翻转每一行: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]]；
 * 然后反转图片: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
 *
 * 说明:
 * 1 <= A.length = A[0].length <= 20
 * 0 <= A[i][j] <= 1
 *
 * @author liubing
 * Date: 2019/8/26 1:51 PM
 * @since JDK 1.8
 */
public class FlipPicture {

    public static void main(String args[]){
        int A[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int B[][] = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int C[][] = {{1}};
        System.out.println(6%2);
        System.out.println(3%2);
        for (int[] ints : flipAndInvertImage(A)) {
            for(int i : ints){
                System.out.print(i);
            }
            System.out.println();
        }

    }

    public static int[][] flipAndInvertImage(int[][] A) {
        int kk = 0;
        if (A == null || A.length==0 || A[0].length == 0) {
            return A;
        }
        int len = A[0].length;
        for (int i = 0; i < A.length; i++ ){
            kk = len % 2 == 0 ? len/2:len/2+1;
            for( int j = 0; j < kk; j++){
                int temp = A[i][j];
                A[i][j] = A[i][len-j-1] ^ 1;
                A[i][len-j-1] = temp ^ 1;
            }
        }
        return A;
    }

}
