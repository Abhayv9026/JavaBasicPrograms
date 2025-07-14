import java.util.Scanner;

public class palindrone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        palindrone check = new palindrone();
        check.ispalin(num);
    }

    public static void ispalin(int num){
        int rev = 0 , sum = 0;
        int temp = num;
        while(num > 0 ){
            rev = num %10;
            sum =(sum *10)+rev;
            num/=10;
        }
        if (sum == temp){
            System.out.println(sum + " is a palindrome no.");
        }else{
            System.out.println(sum + " is not a palindrome no.");
        }
    }
}
