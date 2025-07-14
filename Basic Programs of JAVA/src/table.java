import java.util.*;
public class table {

     void printTable(int n)
    {
        int t = 1;
        for (int i = 1; i <= 10; i++) {
            t = n * i;
            System.out.println(n + " x " + i + " = " + t);
        }
    }
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number :");
            int num = sc.nextInt();
            table obj = new table();
            obj.printTable(num);
       /* this is an main function operation
        int t=1;
        for(int i=1; i<=10; i++){
            t=num*i;
            System.out.println(num + " * " +i + " = " +t);
        */
        }



}