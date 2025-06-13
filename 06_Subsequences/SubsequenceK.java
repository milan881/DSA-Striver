//Print the Subsequences with the sum k

package recursion;

import java.util.ArrayList;

public class SubsequenceK {

    public static void main(String[] args) {
        int arr[] = {1,4,1};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 5;
        
        sub(0, arr, list, 0, k);
    }

    private static void sub(int i, int[] arr, ArrayList<Integer> list, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(list);
            }
            return;
        }

        // Include current element
        list.add(arr[i]);
        
        sub(i + 1, arr, list, sum + arr[i], k);
        //sum+=arr[i];
        // Exclude current element (backtrack)
        list.remove(list.size() - 1);
        sub(i + 1, arr, list, sum, k);
        //sum-=arr[i];
    }
}
