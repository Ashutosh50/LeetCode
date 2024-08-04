package String;

public class RevString {
    public static String RevWord(String s)
    {
        String rev= "";
        int end=s.length();
        for (int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ' || i==0)
            {
            int start;
            if(i==0)
            {
            start=0;
            }
            else
                start=i+1;

            for (int j=start;j<end;j++)
            {
                rev+=s.charAt(j);
            }
            if(i != 0)
                rev +=' ';

            end = i;
            }
        }
        return rev;
    }

    public static void main(String[] args) {
        String s= "Java is Good";
        System.out.println(RevWord(s));
    }
}
