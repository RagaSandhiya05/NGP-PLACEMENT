1.//Anagram - frequency Table 
import java.util.*;
public class Main
{
    public static void fun(String str, int fre[])
    {
        for(int i=0;i<str.length();i++)
        {
            int ind = str.charAt(i)-97;
            fre[ind]++;
        }
        for(int i=0;i<26;i++)
        {
            System.out.print(fre[i]+" ");
        }
        System.out.println();
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1=sc.next().toLowerCase();
		String str2=sc.next().toLowerCase();
		int fre1[]=new int[26];
		int fre2[]=new int[26];
		fun(str1,fre1);
		fun(str2,fre2);
		for(int i=0;i<26;i++)
		{
		    if(fre1[i] != fre2[i])
		    {
		        System.out.print("Not an anagram");
		        return;
		    }
		}
		System.out.print("Anagram");
	}
}

Output
aabbbcvz
aacvzbbb
2 3 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 
2 3 1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 0 1 
Anagram


2.//longest palindromic substring
import java.util.*;
public class Main
{
    public static boolean isPalin(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		int max=0;
		String ans="";
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        String s = str.substring(i,j+1);
		        if(isPalin(s))
		        {
		            if(max < s.length())
		            {
		                max=s.length();
		                ans=s;
		            }
		        }
		    }
		}
		System.out.print(ans);
		
	}
}

Output
aaaaabbccc
aaaaa


3.//Compress A String
import java.util.*;
public class Main
{
    public static boolean isPalin(String str)
    {
        int n=str.length();
        for(int i=0;i<n/2;i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int n=str.length();
		int c=0;
	    for(int i=0;i<n;i++)
	    {
	        char ch = str.charAt(i);
	        c=0;
	        for(int j=i;j<n;j++)
	        {
	            if(ch == str.charAt(j))
	            {
	                c++;
	                i++;
	            }
	            else
	            {
	                break;
	            }
	        }
	        System.out.print(ch+""+c);
	        i--;
	    }
		
	}
}

Output
aaaabbbcccdd
a4b3c3d2



