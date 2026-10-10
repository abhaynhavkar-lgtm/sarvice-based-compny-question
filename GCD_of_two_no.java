//find GCD of two Number 
class GCD_of_two_no
{
    public static void main(String args[])
    {
     int no1=6;
     int no2=18;
     int GCD=1;
     
     for(int i=1;i<=no1 && i<=no2;i++)
     {
         if(no1%i==0 && no2%i==0)
         {
             GCD=i;
         }
     }
     
     System.out.println("Gretest common divisor="+GCD);
     
    }
}


