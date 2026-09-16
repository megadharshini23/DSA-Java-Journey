public class Lineartarget {

    public static void main(String[]args)
    {
        int[] arr={10,20,30,50,60};
        int target=50;
        boolean found=false;
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                System.out.println("Found at "+ i);
                 found=true;
            }
        }
        if(found==false)
        { 
            System.out.println("not Found");
        }
            

    }
}