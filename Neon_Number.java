//Neon Number 
class Neon_Number
{
    public static void main(String args[])
    {
     int no=9;
     int square=no*no;//81
     int sum=0;
     while(square>0)
     {
         
        int last=square%10;
         sum=sum+last;
         square=square/10;
     }
   if(no==sum)
   {
       System.out.println("Neon Number");
   }
   else
   {
     System.out.println("Not Neon Number");
   }
     
    }
}

/*Neon Number means:

 9 number jyachya square chi digit chi Adition tyach  number evdhi yet asel tr to neon

9 = 81 

8+1=9
*/