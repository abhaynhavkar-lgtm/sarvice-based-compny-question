//Amstrong number
class Amstrong_number
{
    public static void main(String args[])
    {
        int no=151;
        int number=no;
        int last,sum=0;
        
        while(no>0)
        {
            last=no%10;
            
            sum=sum+(last*last*last);
            
            no=no/10;
        }
        
        if(number==sum)
        {
            System.out.println("Amstrong number");
        }
        else
        {
            System.out.println("Not a Amstrong number");
        }
        
    }
}

//Amstrong number 153= 3*3*3