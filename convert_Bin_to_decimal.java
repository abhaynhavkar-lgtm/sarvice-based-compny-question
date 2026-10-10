import java.util.*;
class convert_Bin_to_decimal
{
    public static void main(String args[])
    {
        int no=1101;
        int val=no;
        int p=0;
        int sum=0;
        while(no>0)
        {
            int last=no%10;
            
            int power=(int)Math.pow(2,p);
               p++;
          sum=sum+(power*last);
          
          no=no/10;
        }
        
        System.out.println(val+" convert Bin to decimal="+sum);
    }
}