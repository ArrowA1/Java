public class Prime
{
    boolean isprime (int n)
    {
        int i, c=0;
        for(i=1;i<=0;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return true;
        else
        return false;
    }
    public void main(String args[])
    {
        int j;
        for(j=1;j<=0;j++)
        {
            if (isprime(j)==true)
            System.out.println(j);
        }
    }

}


