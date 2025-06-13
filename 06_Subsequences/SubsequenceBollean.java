//Print any one Subsequences

package recursion;

import java.util.ArrayList;

public class SubsequenceBollean {

    public static void main(String[] args) {
        int arr[] = {1,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int k = 2;
        
        sub(0, arr, list, 0, k);
    }

    private static boolean sub(int i, int[] arr, ArrayList<Integer> list, int sum, int k) {
        if (i == arr.length) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        // Include current element
        list.add(arr[i]);
        
        if( sub(i + 1, arr, list, sum + arr[i], k) == true) {
        	return true;
        }
        //sum+=arr[i];
        // Exclude current element (backtrack)
        list.remove(list.size() - 1);
        if( sub(i + 1, arr, list, sum, k) == true) {
        	return true;
        }
        
        return false;
    }
}
