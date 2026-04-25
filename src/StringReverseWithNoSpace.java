import java.util.Scanner;

public class StringReverseWithNoSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string......");
        String input = sc.nextLine();
        String result = reverseAndRemoveSpaceManual(input);
        System.out.println("Reverse string without space: "+result);
        sc.close();

    }
        public static String reverseAndRemoveSpaceManual(String str){

        char ch[] = str.toCharArray();
        int length = ch.length;
        StringBuilder sb = new StringBuilder();
        for (int i = length-1;i>=0;i--){
            if(ch[i]!= ' '){
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
}
