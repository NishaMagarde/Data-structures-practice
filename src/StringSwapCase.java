import java.util.Scanner;

public class StringSwapCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string ....");
        String input = sc.nextLine();
        String result =  swapCase(input);
        System.out.println("Original string :- " +input);
        System.out.println("...............");
        System.out.println("Swapped :- " +result);
    }
    public static String swapCase(String str){

        StringBuilder sb = new StringBuilder();
        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
                else if(Character.isLowerCase(c)){
                    sb.append(Character.toUpperCase(c));
                }
                else{
                    sb.append(c);
            }
        }
        return sb.toString();

    }
}
