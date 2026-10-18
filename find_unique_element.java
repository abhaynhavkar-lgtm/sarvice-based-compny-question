//first non repeting element in array
class find_unique_element
{
    public static void main(String args[])
    {
        int arr[]={4,5,1,2,1,4,5};
        int n=arr.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            
           ans=ans^arr[i];
        }
        System.out.println(ans);
    }
}