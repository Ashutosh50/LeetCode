public class FindifDigitGameCanBeWon3232 {
    public boolean canAliceWin(int[] nums){
        int oneDsum=0;
        int twoDsum=0;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]<10) {
                oneDsum += nums[i];
            }
            else
                twoDsum+=nums[i];
        }
//        if (oneDsum==twoDsum)
//        return false;
//        return true;
        return oneDsum != twoDsum;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,4,10};
        FindifDigitGameCanBeWon3232 f= new FindifDigitGameCanBeWon3232();
        boolean result=f.canAliceWin(num);
        System.out.println(result);
        if (result==false)
            System.out.println("Cant win");
        else
        System.out.println("Can win");
//        int oneDsum=0;
//        int twoDsum=0;
//        for(int i=0;i<num.length;i++)
//        {
//            if(num[i]<9) {
//                oneDsum += num[i];
//            }
//            else
//                twoDsum+=num[i];
//        }
//        System.out.println(oneDsum);
//        System.out.println(twoDsum);
    }
}
