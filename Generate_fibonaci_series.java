//Generate fibonacci series 
class Generate_fibonaci_series
{
    public static void main(String args[])
    {
        int a=0,b=1,c;
        int no=8;
        for(int i=1;i<=no;i++)
        {
            System.out.print(a+" ");
             c=a+b;
            a=b;
            b=c;
        }
    }
}

//0 1 1 2 3 5 8 13