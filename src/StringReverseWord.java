import java.util.Scanner;

public class StringReverseWord {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string.....");
        String input = sc.nextLine();
        String result = reverseWords(input);

        System.out.println("Original String :- "+input );
        System.out.println("Without duplicate char String :- "+result );
}

    public static String reverseWords(String sentence){

        String []words = sentence.split("\\s+") ;

        //split by spaces

        StringBuilder sb = new StringBuilder();
        for(String word : words){

            //reverse each word and append

          String reversedWord = new StringBuilder(word).reverse().toString();

          sb.append(reversedWord).append(" ");
        }

        // remove trailing apace

    return sb.toString().trim();
    }
}


/*
 public static String reverseWord(String sentence){
StringBuilder result = sentence.split("\\s+");
for( String word : words){
    for(int i=word.length()-1;i>=0;i--){
        result.append(word.charAt(i));
        }
    result.append(" ");
        }

return result.toString().trim();
}*/
