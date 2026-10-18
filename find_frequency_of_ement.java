//find frequecy of array element 
import java.util.*;
class find_frequency_of_ement 
{
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,1,2};
        
        HashMap<Integer,Integer> mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        System.out.println(mp);
    }
} 
/*mp.get(arr[i])  frequecy kadhli 2 chi 1  ajun tyamdge +1 add kela