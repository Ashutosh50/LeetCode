package String;

public class Compare {
    public static void main(String[] args) {
        String s1 ="I love java";
        String s2 = "I love C ";

        String [] sr1= s1.split(" ");
        String [] sr2= s2.split(" ");
        for(int i=0;i<sr1.length;i++)
        {
            for (int j=0;j<sr2.length;j++)
            {
                if(sr1[i].equals(sr2[j]))
                    System.out.println("Common : "+sr2[j]);
            }
        }
    }
}
