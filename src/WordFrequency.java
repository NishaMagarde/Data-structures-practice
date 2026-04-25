import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence..");
        String str = sc.nextLine();
        printWordFrequency(str);
    }
    public static void printWordFrequency(String text){

        //convert into lower case and split by spaces

        String [] words=text.toLowerCase().split("\\s+");

        Map<String, Integer> freqword = new HashMap<>();

        for(String word : words){

            freqword.put(word,freqword.getOrDefault(word,0)+1);

        }
        System.out.println("Word frequency : ");

        for(Map.Entry<String , Integer> entry: freqword.entrySet()){
            System.out.println(entry.getKey()+"-> " +entry.getValue());

        }


    }
}
