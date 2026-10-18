//find the second largest element in array
import java.util.*;
class second_Largest_ELEMENT_IN_ARRAY
{
    public static void main(String args[])
    {
        int arr[]={90,70,50,30,10};
        int n=arr.length;
        Arrays.sort(arr);
        int larg=arr[0];
        
       int seclarg=arr[0];
        
        for(int i=1;i<n;i++)
        {
            if(larg<arr[i])
            {
                seclarg=arr[i]; //update
                
                seclarg=arr[i-1];
            }
        }
        System.out.println("second element="+seclarg);
    }
}