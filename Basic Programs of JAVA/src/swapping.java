public class swapping {
    public static void main(String[] args) {
//        int a=10;
//        int b=20;
//        System.out.println("values before swapp is : " + a +" "+ b);
//        int swap= a;
//        a=b;
//        b=swap;
//        System.out.println("values after swapp is : " + a + " "+b);
        int a=10;
        int b=20;
        System.out.println("values before swapp is : " + a +" "+ b);
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("values after swapp is : " + a + " "+b);

    }
}
