//Strong Number 
class automorphic_number
{
    public static void main(String args[])
    {
     int no=10;
     int square=no*no;//625
     
     while(no>0)
     {
         int last=no%10;
         int  squarelast=square%10;
         
         if(last!=squarelast)
         {
             System.out.println("Not Automorphic Number");
             return;
         }
         
         no=no/10;
         square=square/10;
     }
     System.out.println("Automorphic Number");
     
    }
}

/*Automorphic Number means:

A number whose square ends with the same number is called an Automorphic Number.


25 =  625
*/