//check if a Number is perfect Number
class check_perfect_no{
    public static void main(String args[])
    {
     int no=6;
     int sum=0;
     for(int i=1;i<=no/2;i++)
     {
         if(no%i==0)
         {
             sum=sum+i;
         }
     }
     
     if(no==sum)
     {
         System.out.println("perfect Number");
     }
     else
     {
         System.out.println("Not a perfect Number");
     }
     
    }
}
/* svatachi value sodun tyala divide hoin ashya sarv sankyanchi addition*/

