import java.util.Scanner;

public class factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num : ");
        int num = sc.nextInt();
        int temp = 1;
        while(num> 0 ){

            temp = temp*num;
            num--;
        }
        System.out.println("Factorial Of a number is : "+temp);
    }
}