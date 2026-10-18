////REMOVE DUPLICATE FROM SORTED ARRAY
class Remove_duplicate_Sorted_or_unsort_arr 
{
    public static void main(String args[])
    {
        int arr[]={1,1,2,2,3};
        
        int j=0;
        
        for(int i=0;i<arr.length;i++)
        {
           if(arr[i]!=arr[j])
           {
               j++;
               arr[j]=arr[i];
           }
        }
        
        for(int i=0;i<=j;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
}

/*REMOVE DUPLICATE FROM UNSORTED ARRAY
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int arr[]={4,2,4,1,2,3};
        
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        
        for(int x:arr)
        {
            set.add(x);
        }
        System.out.println(set);
       
    }
}*/