//Strong Number 
class Strong_Number
{
    public static void main(String args[])
    {
        int no=145;
        int backup=no;
        int last,sum=0;
        
        while(no>0)
        {
            last=no%10;
            int fact=1;
            
           for(int i=1;i<=last;i++)
           {
               fact=fact*i;
           }
           
           sum=sum+fact;
           
            no=no/10;
        }
        
        if(sum==backup)
        {
            System.out.println("perfect number");
        }
        else
        {
           System.out.println("Not perfect number");
   
        }
       
    }
}

// 1 4 5 =  120+ 24 + 1