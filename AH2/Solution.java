import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int number){
        if (number==1) return false;

        for(int i = 2; i<=10; i++){
            if(number%i==0 && number!=i) {
                System.out.println(i);
                return false;}
        }
        
        return true;
    }
}