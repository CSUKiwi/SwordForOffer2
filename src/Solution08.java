/**
 * @author Kiwi
 * @date 2019/4/20 9:37
 */
/**
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 * */
public class Solution08 {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)
            return null;
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null)
                node = node.left;
            return node;
        }
        while (pNode.next != null){
            TreeLinkNode node = pNode.next;
            if (pNode == node.left)
                return node;
            else
                pNode = node;
        }
        return null;
    }
}