1.//swap first and last Letter and special characters should remain in the same place
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		StringBuilder sb = new StringBuilder(str);
		int len=str.length();
		int i=0, j=len-1;
		while(i<j)
		{
		    char ch1 = sb.charAt(i);
		    char ch2 = sb.charAt(j);
		    if(!Character.isLetter(ch1))
		    {
		        i++;
		    }
		    else if(!Character.isLetter(ch2))
		    {
		        j--;
		    }
		    else
		    {
    		    sb.setCharAt(i,ch2);
    		    sb.setCharAt(j,ch1);
    		    i++;
    		    j--;
		    }
		}
		System.out.print(sb.toString());
	}
}

Output
Java@#$isFun&*()
nuFs@#$iavaJ&*()


2.//Reduce consecutive repeating characters to one.
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
	        System.out.print(ch+"");
	        i--;
	    }
		
	}
}

Output
aaabbbcccddddee
abcde


3.//Camel Space - first letter of each word should be capital and no space in between 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                output.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
        }
        System.out.println(output.toString());
    }
}

Output
java is fun
JavaIsFun


4.//print repeated characters alone
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		printDuplicates(input);
	}
	public static void printDuplicates(String str) {
		int len = str.length();
		boolean[] print = new boolean[len];
		for (int i = 0; i < len; i++) {
			if (print[i]) continue;
			int count = 1;
			for (int j = i + 1; j < len; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					count++;
					print[j] = true;
				}
			}
			if (count > 1) {
				System.out.print(str.charAt(i) + " ");
				print[i] = true;
			}
		}
	}
}

Output
Java programmming
a r g m 


5.//Password 
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		boolean isValid = true;
		for(int i = 0 ; i < str.length() ; i++) {
			char ch = str.charAt(i);
			if(!Character.isDigit(ch) && !Character.isLetter(ch)) {
				isValid = false;
				break;
			}
		}
		if(isValid) {
			System.out.println("Valid password");
		}
		else {
			System.out.println("Not a valid Password");
		}
	}
}

Output
san123ngp
Valid password


6.//Reverse the sentence
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        String[] str1 = str.split(" ");
        int n = str1.length;
        for (int i = 0; i < n / 2; i++) {
            String temp = str1[i];
            str1[i] = str1[n - 1 - i];
            str1[n - 1 - i] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(str1[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}

Output
java is a powerful programming language
language programming powerful a is java







