package String;

public class Cpy {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("i love java");
        StringBuilder s2 = new StringBuilder();

        for (int i = 0; i < s1.length(); i++)
        {
            char ch= s1. charAt(i);
            s2.append(ch);
        }
        System.out.println(s1);
        System.out.println(s2);
    }
}
