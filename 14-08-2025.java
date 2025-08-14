1.//Return the longest number from the string
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] parts = str.split("[^0-9]+"); 
        String max = "";
        for (String p : parts) {
            if (p.length() > max.length() || 
               (p.length() == max.length() && p.compareTo(max) > 0)) {
                max = p;
            }
        }
        System.out.println(max);
    }
}

//Output
Enter a string: happy12hii56789how are you1235
56789
