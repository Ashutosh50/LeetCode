import java.util.Scanner;

public class SearchInsertPosition {
    public int searchInsert(int[] num, int target) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                return i;
            }
            else{
                if(num[i]>target)
                    return i;
            }
        }
        return num.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        SearchInsertPosition s = new SearchInsertPosition();
        int result = s.searchInsert(a, target);

        System.out.println("The target should be inserted at index: " + result);
    }
}
