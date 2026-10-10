//convert decimal to binary
import java.util.*;
class convert_decimal_To_Bin
{
    public static void main(String args[])
    {
        int no=10;
        int val=no;
        int p=0;
        int sum=0;
        while(no>0)
        {
         int last=no%2;
         int power=(int)Math.pow(10,p);
         p++;
         sum=sum+(power*last);
          no=no/2;
        }
     System.out.println(sum);   
    }
}