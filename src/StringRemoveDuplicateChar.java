import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringRemoveDuplicateChar {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
         System.out.println("Enter your string.....");
         String input = sc.nextLine();
         String result = removeDuplicateChar(input);

         System.out.println("Original String :- "+input );
        System.out.println("Without duplicate char String :- "+result );


    }
    public static String removeDuplicateChar(String str){


        //LHS maintain insertion order and automatically remove duplicate

        LinkedHashSet<Character> set= new LinkedHashSet<>();

        //add each character to the set

        for (char c: str.toCharArray()){
            set.add(c);

        }
       //convert set back to the string

        StringBuilder sb =new StringBuilder();
        for(char c:set){
            sb.append(c);

        }
        return sb.toString();

    }
}
