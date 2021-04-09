package bizseer.demik.letcode.other;


/**
 * @author AthyLau
 * @date: 2019/11/18 10:29 AM
 * @since JDK 1.8
 */
public class SingleLinkLoop {

    public static void main(String args[]) {

        ListNode listNode1 = new ListNode("A");
        ListNode listNode2 = new ListNode("B");
        ListNode listNode3 = new ListNode("C");
        ListNode listNode4 = new ListNode("D");
        ListNode listNode5 = new ListNode("E");
        ListNode listNode6 = new ListNode("F");
        ListNode listNode7 = new ListNode("G");

        // 12345组成环
        // listSize - loopSize
        // loopSize = fast 第一次相遇 slow 时跳的次数 n
        // listSize - fast 第一次相遇 slow 时跳的次数 n
        // ( list - n )
        /**
         *          A ----> B ----> C ----> D ----> E ----> F
         */
        listNode1.afterNode = listNode2;
        listNode2.afterNode = listNode3;
        listNode3.afterNode = listNode4;
        listNode4.afterNode = listNode5;
        listNode5.afterNode = listNode3;

        System.out.println(isLoop(listNode1));
        System.out.println(getLoopEntrance(listNode1).val);

        listNode5.afterNode = listNode6;
        listNode6.afterNode = listNode7;
        //          A  ---->  B  ---->  C  ---->  D  ---->  E  ---->  F  ---->  G
        System.out.println(getDescESCSpecifiedNode(listNode1, 2).val);



    }

    private static class ListNode {
        ListNode afterNode;
        String val;

        public ListNode(String val) {
            this.val = val;
        }
    }

    // 判断单链表是否存在环
    private static boolean isLoop(ListNode root) {
        if (root == null) {
            return false;
        }
        ListNode fast = root;
        ListNode slow = root;
        while (fast != null && fast.afterNode != null) {
            fast = fast.afterNode.afterNode;
            slow = slow.afterNode;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    // 找到单链表中存在的环入口
    private static ListNode getLoopEntrance(ListNode root) {
        if (root == null) {
            return null;
        }
        ListNode fast = root;
        ListNode slow = root;
        while (fast != null && fast.afterNode != null) {
            fast = fast.afterNode.afterNode;
            slow = slow.afterNode;
            if (fast == slow) {
                break;
            }
        }
        // 链表不存在环
        if (fast == null || fast.afterNode == null) {
            return null;
        }
        slow = root;
        while (slow != fast) {
            slow = slow.afterNode;
            fast = fast.afterNode;
        }
        return slow;
    }

    // 输出链表中的倒数第K个节点、输出链表中的正数第 K - 1 个节点
    private static ListNode getDescESCSpecifiedNode(ListNode root,int k) {
        if (root == null) {
            return null;
        }
        ListNode fast = root;
        ListNode slow = root;
        int index = 0;
        while (fast.afterNode != null) {
            index ++;
            fast = fast.afterNode;
            if (index > k - 1) {
                slow = slow.afterNode;
            }
        }
        return slow;
    }


}
