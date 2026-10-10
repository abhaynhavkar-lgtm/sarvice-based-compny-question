//reverse nuber
class reverse_nuber
{
    public static void main(String args[])
    {
        int no=1234;
        int last=0,rev=0;
        
        while(no>0)
        {
            last=no%10;
            
            rev=(rev*10)+last;
            
            no=no/10;
        }
        
        System.out.println("reverse number="+rev);
    }
}