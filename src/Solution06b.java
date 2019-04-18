/**
 * @author Kiwi
 * @date 2019/4/18 18:37
 */

import java.util.ArrayList;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * a:利用栈来实现。
 * b:利用指针来实现。
 * */

public class Solution06b {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(listNode == null)
            return arrayList;
        ListNode node = listNode;
        ListNode cur = listNode.next;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = node;
            node = cur;
            cur = next;
        }
        listNode.next = null;
        while(node != null){
            arrayList.add(node.val);
            node = node.next;
        }
        return arrayList;
    }
}
