//intersect or common of two Array 
import java.util.*;
class intersect_or_common_of_two_array
{
    public static void main(String args[])
    {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        
        HashSet<Integer> set=new HashSet<>();
        
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]); //3 remove kela arr2[i]=3
            }
        }
    }
} 
