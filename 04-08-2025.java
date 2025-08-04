1.//Strings
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = "Hello";
        String str2 = str1;
        if(str1 == str2) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}

Output
true

  
2.//String[] parts = str.split(" ");
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "HiihelloiWelicome";
		String[] sub = str1.split("i");
		for(int i = 0 ; i < sub.length ; i++) {
			System.out.print(sub[i]+ " ");
		}
	}
}

Output
H  hello Wel come 

  
3.//String Reverse
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        String s = "Java Programming";
        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i]);
    }
}

Output
gnimmargorP avaJ

  
4.//Chech Palindrome
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String revStr = "";
		int strLength = str.length();
		for (int i = strLength - 1; i >= 0; --i) {
			revStr = revStr + str.charAt(i);
		}
		if (str.equals(revStr)) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}

Output
Enter a string: radar
radar is a Palindrome String.


5.//find the longest word in the sentence
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] word = str.split(" ");
        String longest = "";
        for(int i = 0 ; i < word.length ; i++) {
            if(word[i].length() > longest.length()) {
                longest = word[i];
            }
        }
        System.out.print(longest + " ");
            }
        }

Output
Hii i am Raga Sandhiya
Sandhiya 


6.//Uppercase and Lowercase letters - inbuilt method
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter a string: ");
    String str1 = sc.nextLine();  
    System.out.println(str1.toUpperCase());
    System.out.println(str1.toLowerCase());
  }
}

Output
Enter a string: sandhiya
SANDHIYA
sandhiya


7.//Convert caps to lower , and lower to caps
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            }
            else if(ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            }
            else {
                result = result + ch;
            }
        }
        System.out.print(result + "");
    }
}

Output
ProGRAmmiNG
pROgraMMIng


8.//Anagrams
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		if(s1.equals(s2)) 
			System.out.print("Anagram");
			else {
				System.out.print("Not an Anagram");
			}
		}
	}

Output
listen
silent
Anagram


9.//vowels
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.next();
	    String vowels = "aeiouAEIOU";
	    for(int i = 0 ; i < str.length() ; i++)
	    {
	        if(vowels.contains(str.charAt(i) + ""))
	        {
	            System.out.println(str.charAt(i));
	        }
	    }
	}
}

Output
Sandhiya
a
i
a


10.//Reverse each  word in sentence
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            String reversedWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i); 
            }
            result += reversedWord + " ";
        }
        System.out.println(result.trim()); 
    }
}

Output
i like programming
i ekil gnimmargorp
