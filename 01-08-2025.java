1.// remove duplicates
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for(int i = 0 ; i < n ; i++)
        {
            if(max < arr[i])
            max = arr[i];
        }
         int replace = max + 1;
         for(int i = 0 ; i < n ; i++) 
         {
             if(arr[i] != replace)
             {
                 for(int j = i + 1 ; j < n ; j++)
                 {
                     if(arr[i] == arr[j])
                     {
                         arr[j] = replace;
                     }
                 }
             }
         }
         for(int i = 0 ; i < n ; i++)
         {
             if(arr[i] != replace)
             System.out.print(arr[i] + " ");
         }
    }
}

//Output
5
1 2 3 2 1
1 2 3 




2.// 0 gets printed at the end
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                b[index++] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}

//Output
5
2 5 0 0 4
2 5 4 0 0 


        
        
