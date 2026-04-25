import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string........");
        String str = sc.nextLine();
        char []ch = str.toCharArray();
        for (int i = str.length()-1; i>=0 ; i--) {
           int reverse = ch[i];
            System.out.print(ch[i]);
        }
       // System.out.println(ch[i]);
        sc.close();
    }
}
