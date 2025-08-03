1.//Missing Numbers
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n-1 ; i++)
        {
            if(arr[i]+1 != arr[i+1]);
            {
                System.out.print(arr[i] + 1);
                break;
            }
        }
    }
}



2.//longest Subarray
import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int max=0;
		int cuLen=0;
		int flag=0;
		int st=0,en=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        flag=0;
		        for(int k=i;k<=j-1;k++)
		        {
		            if(arr[k] > arr[k+1])
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		        {
		            cuLen=j-i+1;
		        }
		        if(max < cuLen)
		        {
		            max=cuLen;
		            st=i;
		            en=j;
		        }
		    }
		}		
		System.out.println(max);
		for(int i=st;i<=en;i++)
		{
		    System.out.print(arr[i]+" ");
		}
// 		int n = sc.nextInt();
// 		int arr[]=new int[n];
// 		for(int i=0;i<n;i++)
// 		{
// 		    arr[i]=sc.nextInt();
// 		}

	}
}



3.//2D Array Declaration
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n ; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}

    

4.//Matrix Multiplication
int[][] res = new int[n1][m2];
int i = 0 ; i < n1 ; i++)
{
    for(int j = 0 ; j < m2 ; j++)
    {
        int sum = 0;
        for(int k = 0 ; k < m1 ; k++)
        {
            sum = sum + (arr[i][k] * arr2[k][j]);
        }
        res[i][j] = sum;
    }
}
