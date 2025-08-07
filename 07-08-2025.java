1.//Recursion
public class Main
{
	public static void fun(int n)
	{
		if(n<=0)
			return;
		System.out.print(n+" ");
		fun(n-1);
	}
	public static void main(String[] args)
	{
		int n = 10;
		fun(n);
	}
}

Output :
10 9 8 7 6 5 4 3 2 1 


2.public class Main {
	public static int sum(int n) {
		if (n == 0)
			return 0;
		return n + sum(n - 1);
	}

	public static void main(String[] args) {
		int n = 5;
		System.out.println(sum(n));
	}
}

Output
15


3.public class Main
{
	public static void fun(int n)
	{
		if(n<=0)
			return;
		fun(n-4);
		System.out.print(n+" ");
		fun(n-5);
	}
	public static void main(String[] args)
	{
		int n = 10;
		fun(n);
	}
}

Output
2 6 1 10 1 5 


4.public class Main {
	public static int fun(int n) {
		if (n > 90)
			return n - 10;
		return fun(fun(n + 11));
	}

	public static void main(String[] args) {
		System.out.println(fun(85));
	}
}

Output
81


5.public class Main {
    public static void fun(int n) {
        if (n <= 0)
            return;
        System.out.print(n + " ");
        fun(n - 2);
        fun(n - 3);
    }

    public static void main(String[] args) {
        int n = 6;
        fun(n);
    }
}

Output
6 4 2 1 3 1 


6.public class Main
{
    public static void fun(int n)
    {
        if(n<=0)
            return;
        System.out.print(n+" ");
        fun(n-3);
        fun(n-4);
    }
	public static void main(String[] args) 
	{
		int n = 10;
		fun(n);
	}
}

Output
10 7 4 1 3 6 3 2 


7.public class Main
{
	public static int fun(int i)
	{
		if (i % 2 != 0)
		{
			return i++;
		}
		else
		{
			return fun(fun(i - 1));
		}
	}
	public static void main(String[] args)
	{
		System.out.println(fun(200) + " " + fun(201));
	}
}

Output
199 201


8.public class Main {
    public static void fun(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            fun(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        fun(3);
    }
}

Output
3 2 1 1 2 3 


9.public class Main {
    public static void fun(int n) {
        if (n <= 0) {
            return;
        }
        System.out.print(++n + " ");
        fun(n - 2);
    }

    public static void main(String[] args) {
        int a = 5;
        fun(a);
        System.out.println();
    }
}

Output
6 5 4 3 2 


10.public class Main {
    public static void fun(int n) {
        if (n <= 1) {
            return;
        }
        fun(n - 1);
        System.out.print(++n + " ");
    }

    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }
}

Output
3 4 5 6 


11.public class Main {
    public static void fun(int n) {
        if (n <= 1) {
            return;
        }
        System.out.print(n + " ");
        fun(n - 1);
        System.out.print(++n + " ");
    }

    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }
}

Output
5 4 3 2 3 4 5 6 


12.public class Main {
    public static void fun(int n) {
        if (n <= 1) {
            return;
        }
        System.out.print(n++ + " ");
        fun(n - 3);
        System.out.print(++n + " ");
    }

    public static void main(String[] args) {
        int a = 5;
        fun(a);
    }
}

Output
5 3 5 7 


13.public class Main {
	public static void fun(int n) {
		if (n <= 1) {
			return;
		}
		fun(n - 3);
		fun(n - 4);
		System.out.print(++n + " ");
	}

	public static void main(String[] args) {
		int a = 10;
		fun(a);
	}
}

Output
5 4 8 4 3 7 11 


14.public class Main {
    public static void fun(int n) {
        if (n <= 5) {
            return;
        }
        fun(n - 3);
        System.out.print(--n + " ");
        fun(n - 2);
        
    }
    public static void main(String[] args) {
        int a = 10;
        fun(a);
        fun(a+2);
    }
}

Output
6 9 6 5 8 5 11 5 8 5 


15.public class Main {
    public static int fun(int n) {
        if (n <= 7) {
            return n;
        }
        System.out.print(--n + " ");
        fun(fun(n - 2));
        return --n;
    }

    public static void main(String[] args) {
        int a = 17;
        fun(a);
        
    }
}

Output
16 13 10 7 8 11 8 


16.public class Main {
    static int x = 10;
    public static int fun(int n) {
        if (n <= 7) {
            return n;
        }
        System.out.print(--n + " ");
        fun(fun(n - 2));
        return x-x;
    }

    public static void main(String[] args) {
        int a = 17;
        fun(a);
        
    }
}


Output
16 13 10 7 


17.//Collections - ArrayList - Remove Duplicates , print Duplicate values
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int[] arr = new int[n];  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!list1.contains(arr[i])) {
                list1.add(arr[i]);
            } else {
                list2.add(arr[i]);
            }
        }
        System.out.println(list1);
        System.out.println(list2);
    }
}

Output
5
2 4 5 3 2
[2, 4, 5, 3] ---> Remove duplicates
[2] ----> Print duplicates
