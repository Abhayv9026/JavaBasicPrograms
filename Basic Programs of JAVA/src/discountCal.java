import java.util.*;
 class discountCal {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Welcome to Discount calculator : ");
         System.out.println("Pls Enter your age : ");
         int age = sc. nextInt();
         System.out.println("Are you a Female (true/false) : ");
         boolean isFemale = sc.nextBoolean();

         if(age< 5)
         {
             System.out.println("You Got 75% discount.");
         } else if (isFemale) {
             System.out.println("You got 50% Discount.");
         } else if (age > 60 && !isFemale) {
             System.out.println("You Got only 25% od Discount.");
         }
         else{
             System.out.println("You Don't get any Discount.");
         }
     }
}
