//FIND THE SECONDE SMALLEST ELEMENT IN ARRAY 
import java.util.*;
class second_smallest_element
{
    public static void main(String args[])
    {
        int arr[]={7,7,7};
        
        Arrays.sort(arr);
        
        if(arr.length<2)
        {
            System.out.println("Not Exist");
            return;
        }
       
        int count=0;
        int sm=[0];
       int i=1;
       
       while(i<arr.length && sm==arr[i])
       {
           i++;
       }
       
       if(arr.length==i)
       {
           System.out.println("Not Exist");
       }
       else
       {
           System.out.println(arr[i]);
       }
    }
}
