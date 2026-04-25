import java.util.Scanner;

public class FabonacciNumber {

        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter your number: ");
           int ip = sc.nextInt();

           if(isFabonacci(ip)) {
               System.out.println(ip + " - is a Fabonacci number.");
           }else
               System.out.println(ip+ " - is not a Fabonacci number." );


        }
        public static boolean isFabonacci(int n){
            if(n==0  ||n==1){
                return true;
            }
            int a=0,b=1,c;
            while(true){
                c=a+b;
                if(c== n){
                    return true;
                } else if (c>n) {
                    return false;
                }
                a=b;
                b=c;
            }
        }

    }

