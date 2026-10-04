//ckeck whether tha number is automorphic or not  
class Automorphic_no_demo
{
    public static void main(String args[])
    {
        int no=6;
        int square=no*no;
        while(no>0)
        {
            if(no%10!=square%10)
            {
                System.out.println("Not a automorphic");
                return;
            }
            no=no/10;
            square=square/10;
        }
        System.out.println("automorphic number");
        
        
    }
}