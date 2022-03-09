public class helloworld
{
    public static void main(String args[])
    {
        System.out.println("Hello World");
        int s=sum(12,18);
        System.out.println("Sum of 12 and 18 is "+s);
    }

    static int sum(int a, int b)
    {
        int s=a+b;
        return s;
    }
}