import java.util.*;
public class simplename {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls Enter your name");
        String name= sc.nextLine();
        System.out.print(" , also enter two numbers to be added : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int sum = a+b;
        System.out.println("hello " + name + "\nAddition of Numbers is : " +sum );
    }
}
