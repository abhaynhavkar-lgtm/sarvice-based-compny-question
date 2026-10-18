/*FIND DUPLICATE ELEMENT IN ARRAY 
class Main 
{
    public static void main(String args[])
    {
        int arr[]={1,3,4,2,2};
        
        int slow=arr[0];
        int fast=arr[0];
        
        do
        {
            slow=arr[slow];
            
            fast=arr[arr[fast]];
            
        }while(slow!=fast);
        
        slow=arr[0];
        
        while(slow!=fast)
        {
            slow=arr[slow];
            
            fast=arr[fast];
        }
        
        System.out.println(slow);
    }
}*/

//using HashSet approach
import java.util.*;
class FIND_DUPLICATE_USING_HASHMAP
{
    public static void main(String args[])
    {
        int arr[]={1,1,3,4,2,2};
        HashSet<Integer> st=new HashSet<>();
        
        for(int x:arr)
        {
            if(!st.add(x))
            {
                System.out.print(x);
            }
        }
    }
}