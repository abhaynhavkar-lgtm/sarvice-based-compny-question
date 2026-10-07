//find Nth fibonacci series 
class find_Nth_fibonacci_series
{
    public static void main(String args[])
    {
        int a=0,b=1,c;
        int no=5;
        for(int i=1;i<no;i++)
        {
           
            c=a+b;
            a=b;
            b=c;
        }
         System.out.print(a+" ");
    }
}

//0 1 1 2 3 5 8 13