import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = sc.nextInt(); 
        fizzBuzz(n);
        System.out.println();
        System.out.println(fizzBuzzRecursive(n));
        sc.close();
    }

    public static void fizzBuzz(int n){
        for(int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0) System.out.print("FizzBuzz ");
            else if (i%3==0) System.out.print("Fizz ");
            else if (i%5==0) System.out.print("Buzz ");
            else System.out.print(i + " ");
        }
    }

    public static String fizzBuzzRecursive(int n){
        //fizzBuzzRecursive(n-1);

        if (n==1) return "1 ";
        else if(n%3==0 && n%5==0) return fizzBuzzRecursive(n-1) + "FizzBuzz ";
        else if (n%3==0) return fizzBuzzRecursive(n-1) + "Fizz ";
        else if (n%5==0) return fizzBuzzRecursive(n-1) + "Buzz ";
        else return fizzBuzzRecursive(n-1) + n + " ";
    }
}
