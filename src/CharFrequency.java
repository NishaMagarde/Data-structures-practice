import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text.............");
        String str = sc.nextLine();
        //System.out.println(printCharFrequency(str));
        printCharFrequency(str);
    }

    public static void printCharFrequency(String text) {

        text = text.toLowerCase();

        Map<Character, Integer> freqmap = new HashMap<>();
        //count each character

        for (char c : text.toCharArray()) {
            if(c!=' ')
            freqmap.put(c, freqmap.getOrDefault(c, 0) + 1);
        }
        //print character frequency

        System.out.println("character frequency: ");

        for (Map.Entry<Character, Integer> entry : freqmap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' ->" + entry.getValue());
        }
    }

    }

