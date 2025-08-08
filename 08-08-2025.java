/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
1.//Leetcode - LinkedList
  class Solution {
    public void deleteNode(ListNode node) {
        
        ListNode temp=null;
        while(node.next!=null)
        {
            node.val=node.next.val;
            temp=node;
            node=node.next;
        }
        temp.next=null;     
    }
}


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
2.public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                return true;
            }
        }
        return false;
    }
}


3.public class Solution {
    public ListNode detectCycle(ListNode head) {
    
    ListNode slow=head;
    ListNode fast=head;

    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast)
        {
            break;
        }
    }
    if(fast==null || fast.next==null)
    {
        return null;
    }
    slow=head;
    while(slow!=fast)
    {
        slow=slow.next;
        fast=fast.next;
    }

    return slow;

}
}


4.//LinkedList - Insertion and Deletion
import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class LinkedList
{
	Node head=null;
	public void insertAtEnd(int data)
	{
		Node x = new Node(data);
		if(head==null)
		{
			head=x;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			temp.next=x;
		}
	}
	public void insertAtBegin(int data)
	{
		Node x = new Node(data);
		if(head==null)
		{
			head=x;
		}
		else
		{
			x.next=head;
			head=x;
		}
	}
	public void insertAtPos(int data, int pos)
	{
		Node x=new Node(data);
		Node temp=head;
		if(pos==1)
		{
			insertAtBegin(data);
			return;
		}
		for(int i=0; i<pos-2; i++)
		{
			temp=temp.next;
		}
		x.next = temp.next;
		temp.next=x;
	}
	public void deleteNode(int value) {
		Node temp = head;
		Node prev = null;
		if (temp != null && temp.data == value) {
			head = temp.next;
			return;
		}
		while (temp != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			System.out.println("Value " + value + " not found.");
			return;
		}
		prev.next = temp.next;
	}

	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		LinkedList z = new LinkedList();
		z.insertAtEnd(10);
		z.insertAtEnd(20);
		z.insertAtEnd(30);
		z.insertAtEnd(40);
		z.insertAtBegin(5);
		z.insertAtBegin(50);
		z.insertAtBegin(60);
		z.insertAtPos(99,1);
		z.insertAtPos(999,8);
		z.insertAtPos(83,2);
		z.display();
		System.out.println();
		z.deleteNode(40);
		z.display();

	}
}

//Output
99 83 60 50 5 10 20 30 999 40 
99 83 60 50 5 10 20 30 999 ----> after deletion of Node 40


