//count digit of number
class count_digit
{
    public static void main(String args[])
    {
        int no=1234;
        int last,count=0;
        
        while(no>0)
        {
            last=no%10;
            count++;
            no=no/10;
        }
        
            System.out.println("count digit="+count);
        
       
    }
}

//Ans=4