// remove duplicates
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

        
        
