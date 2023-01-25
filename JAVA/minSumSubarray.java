package JAVA;
import java.util.*;

public class minSumSubarray {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter number of elements in Array and min sum");
        int n = t.nextInt();
        int s = t.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = t.nextInt();
        }

        MinSubarray m = new MinSubarray();
        int res = m.product(arr, s);
        System.out.println("Number of elements in sub array: "+res);
}
}
class MinSubarray {
    public int product(int[] arr, int s) {
        if(arr == null || arr.length == 0)
        return 0;

        int result = arr.length;
        int start = 0, i = 0, sum = 0;
        boolean exists = false;

        while(i <= arr.length) {
            if(sum >= s) {
                exists = true;
                if(start == i - 1)
                return 1;
    
                result = Math.min(result, i - start);
                sum = sum - arr[start];
                start ++;
            }
            else {
                if(i == arr.length)
                break;
    
                sum += arr[i];
                i++;
            }
        }
        if(exists)
        return result;
        else
        return 0;

    }
}