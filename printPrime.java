public class printPrime
{
    static boolean isprime (int n)
    {
        int i, c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        int j;
        for(j=1;j<=50;j++)
        {
            if (isprime(j)==true)
            System.out.println(j);
        }
    }

}


