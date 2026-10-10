//LCM of two number 
class LCM_of_two_number 
{
    public static void main(String args[])
  {
      int no1=3,no2=5;
      
        int gcd=1;
      for(int i=1;i<=no1&& i<=no2;i++)
      {
          if(no1%i==0 && no2%i==0)
          {
              gcd=i;
          }
      }
      
     int LCM=no1*no2/gcd;
      
      System.out.println("LCM="+LCM);
  }    
}