package JAVA;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {
        int n, i, ele;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter length of array and element ot be removed");
        n = t.nextInt();
        ele = t.nextInt();
        int arr[]  = new int[n];
        System.out.println("Enter element of array");
        for(i = 0; i < n; i++) {
            arr[i] = t.nextInt();
        }
        Duplicate d = new Duplicate();
        int len = d.remove(arr,ele);
        System.out.println("Length of Array is " + len);
    }
}
class Duplicate {
    public int remove(int [] A, int ele) {
        if(A==null)
        return 0;
        else {
            int i = 0;
            int j = 0;
            while(i < A.length) {
                if(A[i] != ele) {
                    j++;
                }
                i++;
            }
            return j;
        }
    }
}
