public class sumfun {
    int a =10;
    int b = 20;
    void sum()
    {
        System.out.println(a+b);
    }
    void sub()
    {
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        sumfun obj1 = new sumfun();
       
        obj1.sum();
        obj1.sub();

    }
}
