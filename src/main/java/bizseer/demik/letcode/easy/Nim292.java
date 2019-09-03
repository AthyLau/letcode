package bizseer.demik.letcode.easy;

/**
 * Function:
 * 你和你的朋友，两个人一起玩 Nim 游戏：桌子上有一堆石头，每次你们轮流拿掉 1 - 3 块石头。 拿掉最后一块石头的人就是获胜者。你作为先手。
 * <p>
 * 你们是聪明人，每一步都是最优解。 编写一个函数，来判断你是否可以在给定石头数量的情况下赢得游戏。
 * <p>
 * 示例:
 * <p>  1   2   3
 * 输入: 4   5   6
 *      7   8   9
 * 输出: false
 * 解释: 如果堆中有 4 块石头，那么你永远不会赢得比赛；
 *      因为无论你拿走 1 块、2 块 还是 3 块石头，最后一块石头总是会被你的朋友拿走。
 * <p>          A   B   A   B
 *     10       3   3   3   1   B
 *     10       3   2   3   2   B
 *     10       3   1   3   3   B
 *     10       2   3   3   2   B
 *     7
 *     8        2               B
 *     8        1   1   3         A
 *
 *
 * @author liubing
 * Date: 2019/9/3 3:26 PM
 * @since JDK 1.8
 */
public class Nim292 {
    public static void main(String args[]) {
    }
    public static boolean canWinNim(int n) {
        if(n<=3) return true;
        if(n%4!=0)
            return true;
        return false;
    }
}
