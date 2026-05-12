import java.util.Scanner;

public class StringReverse {
    /*public static void main(String[] args) {                  //this is also right
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string........");
        String str = sc.nextLine();
        char []ch = str.toCharArray();
        for (int i = str.length()-1; i>=0 ; i--) {
           int reverse = ch[i];
            System.out.print(ch[i]);
        }
       // System.out.println(ch[i]);
        sc.close();                                       MADAM
    }*/


        public static void reverseString(char arr[]) {                      // this is also right

            int right = arr.length - 1;

            for (int left = 0; left < right; left++) {

                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                right--;
            }
        }

        public static void main(String[] args) {

            String str = "MADAM";

            char arr[] = str.toCharArray();

            reverseString(arr);

            System.out.println(arr);
        }
    }



