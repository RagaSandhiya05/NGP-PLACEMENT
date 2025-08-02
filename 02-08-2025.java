1.//Happy Number
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = 0;
        while(n != 1 && n != 4) {
            while(n > 0) {
                int rem = n%10;
                g = g + rem*rem;
                n = n/10;
            }
            n=g;
        }
        if(n==1){
            System.out.print("Happy Number");
        }
        else {
            System.out.print("Not a Happy Number");
        }
    }
}

//Output
19
Happy Number


2.//Bring negative to front
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] neg = new int[n];
        int[] pos = new int[n];
        int negI = 0, posI = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                neg[negI++] = arr[i];
            } else {
                pos[posI++] = arr[i];
            }
        }
        for (int i = 0; i < posI - 1; i++) {
            for (int j = 0; j < posI - i - 1; j++) {
                if (pos[j] > pos[j + 1]) {
                    int temp = pos[j];
                    pos[j] = pos[j + 1];
                    pos[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < negI; i++) {
            System.out.print(neg[i]);
        }
        for (int i = 0; i < posI; i++) {
            System.out.print(pos[i]);
        }
    }
}

//Output 
5
2 -3 4 -5 6
-3 -5 2 4 6


