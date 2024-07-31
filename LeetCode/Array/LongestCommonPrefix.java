import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs)
    {
        StringBuilder prefix = new StringBuilder();
        if (strs==null ||strs.length==0)
            return  "";

        Arrays.sort(strs);
        String First = strs[0];
        String Last = strs[strs.length-1];
        for (int i=0;i<Math.min(First.length(),Last.length());i++)
        {
            if(First.charAt(i)!=Last.charAt(i)) {
                prefix.append("");
                return prefix.toString();
            }
            prefix.append(First.charAt(i));
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String [] input ={"Flow","ight","Fly"};
        LongestCommonPrefix pre = new LongestCommonPrefix();
        String re = pre.longestCommonPrefix(input);
        System.out.println("Common"+re);
    }
}
