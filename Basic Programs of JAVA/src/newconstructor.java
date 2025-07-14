class interst
{
    int l,br,h;
    interst(int a,int b, int c)
    {
        l=a; br=b; h=c;
        System.out.println("Constructor called");
        System.out.println();
    }
    int rect()
    {
        return l*br;
    }
    int sq()
    {
        return l*l;
    }
    int cuboid()
    {
        return l*br*h;
    }
    int cube()
    {
        return l*l*l;
    }
}

class newconstructor
{
    public static void main(String[] args) {
        interst obj1 = new interst(5,6,4);
        System.out.println("First calculation::::");
        System.out.println("Area of rectangle::"  +obj1.rect());
        System.out.println("Area of square::"  +obj1.sq());
        System.out.println("Area of cuboid::"  +obj1.cuboid());
        System.out.println("Area of cube :::"  +obj1.cube());
        System.out.println();
      ///////////New object ///////////////////////////////////

        interst obj2 = new interst(8,4,5);
        System.out.println("Second calculation::::");
        System.out.println("Area of rectangle::" +obj2.rect());
        System.out.println("Area of square::"  +obj2.sq());
        System.out.println("Area of cuboid::"  +obj2.cuboid());
        System.out.println("Area of cube :::"  +obj2.cube());
    }
}
