package bizseer.demik.letcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Function:
 * 写一个 RecentCounter 类来计算最近的请求。
 * 它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。
 * 返回从 3000 毫秒前到现在的 ping 数。
 * 任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。
 * 保证每次对 ping 的调用都使用比之前更大的 t 值。
 * 示例：
 * 输入：inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
 * 输出：[null,1,2,3,3]
 * 提示：
 * 每个测试用例最多调用 10000 次 ping。
 * 每个测试用例会使用严格递增的 t 值来调用 ping。
 * 每次调用 ping 都有 1 <= t <= 10^9。
 *
 * @author liubing
 * Date: 2019/9/4 2:39 PM
 * @since JDK 1.8
 */
public class RecentlyRequest933 {
    public static void main(String args[]){
        RecentlyRequest933 recentlyRequest933 = new RecentlyRequest933();
        System.out.println(recentlyRequest933.ping(642));
        System.out.println(recentlyRequest933.ping(1849));
        System.out.println(recentlyRequest933.ping(4921));
        System.out.println(recentlyRequest933.ping(5936));
        System.out.println(recentlyRequest933.ping(5957));
    }
    private int[] pings;
    private int k;
    private int j;

    public RecentlyRequest933() {
        this.pings = new int[10000];
        this.k = 0;
        this.j = 0;
    }

    public int ping(int t) {
        pings[j++] = t;
        while (t - pings[k] > 3000 && k < j){
            k++;
        }
        return j - k;
    }
}
