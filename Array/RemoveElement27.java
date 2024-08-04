public class RemoveElement27 {
    public static void main(String[] args) {
        int[] a= {3,2,2,3};
        int val =3;
        RemoveElement27 R = new RemoveElement27();
        int Result = R.removeElement(a,val);
//        int i=0;
//        for(int j=0;j<a.length;j++)
//        {
//            if(a[j]!= val) {
//                a[i] = a[j];
//                i++;
//            }
//        }
       System.out.println(Result);
    }
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
