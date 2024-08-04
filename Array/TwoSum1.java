public class TwoSum1 {
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target =9;
        TwoSum1 T = new TwoSum1();
        int a[]=T.twoSum(nums,target);
        int b[]=T.twoSum2(nums,target);
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]);
        System.out.println();
        for(int i=0;i<b.length;i++)
        System.out.print(b[i]);
    }
    public int[] twoSum(int[] nums, int target) {
        int a=0,b=0;
        for(int i=0;  i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    a=i;
                    b=j;
                    break;
                }
            }

        }
        int []arr={a,b};
        return arr;
    }
    //2.
    public int[] twoSum2(int[] nums, int target) {
        for(int i=1;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j]+nums[j-i]==target)
                {
                    return new int[] {j-i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
