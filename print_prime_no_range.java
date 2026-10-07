//PRIME NUMBER 
class print_prime_no_range
{
    public static void main(String args[])
    {
      int start=10,end=30,count=0;
      
      for(int i=start;i<=end;i++)
      {
          count=0;
          for(int j=1;j<=i;j++)
          {
              if(i%j==0)
              {
               count++;   
              }
                 
           }
                if(count==2)
                {
                    System.out.println(i);
                } 
       }
    }
}