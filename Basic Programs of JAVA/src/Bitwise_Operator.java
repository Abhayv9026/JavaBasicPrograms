import java.util.Scanner;
class Bitwise_Operator {
     public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Numbers for BITWISE Operations ");
         System.out.print("Enter First Number : ");
         int first= sc.nextInt();
         System.out.print("Now, Enter Second Number : ");
         int second= sc.nextInt();

         //Bitwise AND
         int result= first & second;

         //Bitwise OR
         int resul= first | second;

         //Bitwise XOR
         int res= first ^ second;

         //Bitwise Compliment
         int r= ~first;

         System.out.println("Resultunt Number After Operation IS : " +result);
         System.out.println("Resultunt Number After Operation IS : " +resul);
         System.out.println("Resultunt Number After Operation IS : " +res);
         System.out.println("Resultunt Number After Operation IS : " +r);


     }
}
