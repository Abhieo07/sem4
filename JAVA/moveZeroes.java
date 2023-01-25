package JAVA;
import java.util.*;

public class moveZeroes {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter length of array");
        int n = t.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter element in array");
        int i = 0;
        while(i < n) {
            arr[i] = t.nextInt();
            i++;
        }

        Move m = new Move();
        m.moveZero(arr);
        int j = 0;
        while(j < n) {
            System.out.print(arr[j]+" ");
            j++;
        }
    }
}

class Move {

    public void moveZero(int [] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length) {
            if(nums[j] == 0)
            j++;
            else {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }
        while(i < nums.length) {
            nums[i] = 0;
            i++;
        }
    }
}