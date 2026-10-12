import java.util.Arrays;

public class REMdublicate {
    
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[j]!=nums[i])
            {
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
            int[] nums={1,1,2};
    
      REMdublicate obj = new REMdublicate();

        int k = obj.removeDuplicates(nums);
        System.out.println(k);

      System.out.println(Arrays.toString(nums));
   }
}

