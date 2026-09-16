public class LinearSearch {

    public static void main(String[]args)
    {
        int[] arr={10,20,30,40,50};
        int  target = 60;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
                System.out.println("Found at index " + i);
        }
    }
}