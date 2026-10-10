//Palindrome number
class check_Palindrome_number
{
    public static void main(String args[])
    {
        int no=121;
        int originalNo=no;
        int rev=0,last;
        while(no>0)
        {
            last=no%10;
            
            rev=rev*10+last;
            
            no=no/10;
        }
        
        if(rev==originalNo)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not Palindrome number");
        }
    }
}

