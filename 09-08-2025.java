1.// Leetcode - 61
class Solution {
    public ListNode rotateRight(ListNode head, int k) 
    {
        if(head == null || head.next == null)
        return head;
        ListNode temp = head , temp1 = head;
        int c = 1;
        while(temp.next != null)
        {
            c++;
            temp = temp.next;
        }
        k = k%c;
        temp.next = head;
        for(int i = 0 ; i < c-k-1 ; i++) 
        {
            temp1 = temp1.next;
        }
        head = temp1.next;
        temp1.next = null;
        return head;
    }
}

// Output
[4,5,1,2,3]
