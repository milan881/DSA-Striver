//Count the no of Subsequences encountered

package recursion;

import java.util.ArrayList;

public class SubsequencesCount {

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        //ArrayList<Integer> list = new ArrayList<>();
        int k = 2;
        
        System.out.println(sub(0, arr,0, k));
    }

    private static int sub(int i, int[] arr, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }

        // Include current element
        //list.add(arr[i]);
        
        int l = sub(i + 1, arr,sum + arr[i], k);
        
        // Exclude current element (backtrack)
        //list.remove(list.size() - 1);
        int r = sub(i + 1, arr,sum, k);
        	return l+r;
    }
}
