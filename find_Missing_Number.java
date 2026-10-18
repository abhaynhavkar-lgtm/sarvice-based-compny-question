

//find missing number in array
import java.util.*;
class find_Missing_Number
{
    public static void main(String args[])
    {
        int arr[]={2};
        
         int n=arr.length+1;
         int sum=0;
         sum=n*(n+1)/2;
           
       for(int i=0;i<n-1;i++)
       {
           sum=sum-arr[i];
       }
       
       System.out.println(sum);
    }
}