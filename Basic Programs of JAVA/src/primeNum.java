import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        boolean p = isprime(num);
        if(p){
            System.out.println("prime");
        }
        else {
            System.out.println("Not Prime");
        }
    }
    public static boolean isprime(int n){
        int i = 2;
        while(i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
