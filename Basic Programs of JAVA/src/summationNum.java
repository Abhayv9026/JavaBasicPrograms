import java.util.Scanner;

class summationNum {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the nummber : ");
         float a = sc.nextFloat();
         int temp=0;

         while(a>0)
         {
             temp +=a%10;
             a/=10;
         }
         System.out.println("Summation of number is : " +temp);
     }
 }