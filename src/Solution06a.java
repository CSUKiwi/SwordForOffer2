/**
 * @author Kiwi
 * @date 2019/4/17 21:49
 */

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 * a:利用栈来实现。
 * b:利用指针来实现。
 * */
public class Solution06a {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        if (listNode == null)
            return arrayList;
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            arrayList.add(stack.pop());
        }
        return arrayList;
    }
}
