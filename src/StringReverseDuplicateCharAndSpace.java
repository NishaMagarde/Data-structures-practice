import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringReverseDuplicateCharAndSpace {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string .....");
        String input = sc.nextLine();
        String result = reverseDuplicateCharAndSpace(input);
        System.out.println("Original string  :- "  + input);
        System.out.println("...................................");
        System.out.println("Without duplicate and remove space :- " +result);
    }
    public static String reverseDuplicateCharAndSpace(String str){

        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char c : str.toCharArray()){
            if(c != ' '){                        // skip space
                set.add(c);

            }
        }

        // Back set to character

        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c);
        }



        return sb.toString();
    }
}
