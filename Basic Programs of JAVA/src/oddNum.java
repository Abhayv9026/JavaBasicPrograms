import java.util.Scanner;

public class oddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        for(int i= 1; i<=num; i+=2){
            System.out.println(i);
        }
    }
}
