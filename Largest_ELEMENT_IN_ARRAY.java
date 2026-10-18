//find the largest element in array
class Largest_ELEMENT_IN_ARRAY
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        
        int largest=arr[0];
        for(int i=1;i<n;i++)
        {
            if(largest<arr[i])
            {
                largest=arr[i];
            }
        }
        System.out.println("Largest element="+largest);
    }
}