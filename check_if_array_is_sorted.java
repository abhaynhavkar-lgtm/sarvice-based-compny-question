//CHECK IF AN ARRAY IS SORTED
class check_if_array_is_sorted
{
    public static void main(String args[])
    {
        int arr[]={1,2,5,4};
        
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                System.out.print(false);
                return;
            }
        }
              System.out.println(true);
    }
}