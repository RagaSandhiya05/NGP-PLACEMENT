1.//Stack - implementation using Linked list - push , pop and peek operations
import java.util.*;
class Node
{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class Stack
{
	Node top=null;
	public void push(int data)
	{
		Node x = new Node(data);
		if(top==null)
		{
			top=x;
		}
		else
		{
			x.next=top;
			top=x;
		}
	}
	public void pop() // return,remove
	{
		if(top!=null)
		{
			System.out.println("Pop element : " + top.data);
			top=top.next;
		}
	}
	public void peek()// return
	{
		if(top!=null)
			System.out.println("Peek element : " + top.data);
	}
	public void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.display();
		s.pop();
		s.pop();
		s.display();
	}
}

//Output
40
30
20
10
Pop element : 40
Pop element : 30
20
10


2.//To remove the character before a vowel using Stack
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		Stack<Character> st = new Stack<>();
		String vow = "aeiouAEIOU";
		for(int i=0; i<str.length(); i++)
		{
			if(vow.contains(str.charAt(i) + ""))
			{
				st.pop();
			}
			else
			{
				st.push(str.charAt(i));
			}
		}
		String ans="";
		while(!st.isEmpty())
		{
			ans = ans + st.pop();
		}
		StringBuilder sb = new StringBuilder(ans);
		ans = sb.reverse().toString();
		System.out.print(ans);
	}
}

//Output
hellonmaexyzohii
lx


3.//Leetcode - 739 - Daily Temperatures
class Solution {
	public int[] dailyTemperatures(int[] t) {
		int arr[] = new int[t.length];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		for(int i = 0 ; i < t.length ; i++) {
			if(t[st.peek()] < t[i])
			{
				while(!st.isEmpty() && t[st.peek()] < t[i])
				{
					arr[st.peek()] = i-st.peek();
					st.pop();
				}
				st.push(i);
			}
			else
			{
				st.push(i);
			}
		}
		return arr;
	}
}


4.//LeetCode 20 - Valid Parantheses
class Solution {
	public boolean isValid(String s) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch=='(')
			{
				st.push(')');
			}
			else if(ch=='{')
			{
				st.push('}');
			}
			else if(ch=='[')
			{
				st.push(']');
			}
			else if(st.isEmpty() || ch != st.pop())
			{
				return false;
			}
		}
		if(st.isEmpty())
			return true;
		return false;
	}
}






