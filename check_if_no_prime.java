//PRIME NUMBER 
class check_if_no_prime
{
    public static void main(String args[])
    {
        int no=-3;
        
        if(no==2)
        {
            System.out.println("prime number");
            return;
        }
        if(no<2)
        {
             System.out.println("Not prime number");
            return;
        }
        
        int count=0;
        for(int i=1;i<=no;i++)
        {
            if(no%i==0)
            {
                count++;
            }
        }
        
        if(count==2)
        {
            System.out.println("Prime number");
        }
        else
        {
           System.out.println("Not Prime number");
        }
    }
}