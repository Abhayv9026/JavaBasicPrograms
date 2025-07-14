import java.util.Scanner;

class algebra
{
    int sum(int a ,int b)      ///formal parameters
    {
        int x = a+b;
        return x;
    }
}
public class method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the credentials :");
        int a= sc.nextInt();
        int b= sc.nextInt();
        algebra add= new algebra();
       int cv = add.sum(a,b);           ///Actual paraters  /////
        System.out.println("The sum of given numbers is :=" +cv);
    }
}
