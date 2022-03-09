public class test
{
   static int isSpy(int n)
    {
       int s=0,p=1,i,d;
        for(i=n;i>0;i=i/10)
        {
          d=i%10;
          s=s+d;
          p=p*d;
         }
         if(s==p)
         return 1;
         else
         return -1;
     }
     
     public static void main(String args[])
     {
        int j;
        for(j=100;j<=2000;j++)
       {
         if(isSpy(j)==1)
         System.out.println(j);
        }
        //return 1;
      }
   }