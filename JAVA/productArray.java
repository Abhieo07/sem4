package JAVA;
import java.util.*;

public class productArray {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("enter number of elements in Array");
        int n = t.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = t.nextInt();
        }

        productExceptSelf p = new productExceptSelf();
        int res[] = p.product(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+"  ");
        }
        
    }
}

class productExceptSelf {
    public int[] product(int[] nums) {
        int result [] = new int[nums.length];
        int temp1 [] = new int[nums.length];
        int temp2 [] = new int[nums.length];

        temp1[0] = 1;
        temp2[nums.length-1] = 1;

        //left to right 
        for(int i = 0; i < nums.length-1; i++) {
            temp1[i + 1] = temp1[i] * nums[i];
        }
        //right to left
        for(int i = nums.length - 1; i > 0; i--) {
            temp2[i - 1] = temp2[i] * nums[i];
        }
        //calculating multiplication
        for(int i = 0; i < nums.length; i++) {
            result[i] = temp1[i] * temp2[i];
        }
        return result;
    }
}