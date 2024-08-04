public class RemoveDuplicatesfromSortedArray26 {
    public static void main(String[] args) {
        int[] a={0,0,1,1,1,2,2,3,3,4};
        RemoveDuplicatesfromSortedArray26 r= new RemoveDuplicatesfromSortedArray26();
        int re=r.removeDuplicates(a);
//        int i=1;
//        for(int j=1;j<a.length;j++)
//        {
//            if(a[j]!=a[i-1])
//            {
//                a[i]=a[j];
//                i++;
//            }
//        }
        System.out.println(re);
    }
    public int removeDuplicates(int[] nums)
    {
        if(nums.length==0)
            return 0;
        int i=1;
        for (int j=1;j<nums.length;j++)
        {
            if (nums[j]!=nums[i-1])
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
