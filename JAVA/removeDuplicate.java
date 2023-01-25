//PROGRAM TO REMOVE DUPLICATES FROM ARRAY
package JAVA;
import java.util.*;

public class removeDuplicate {

    public static void main(String[] args) {
        int n, i;
        Scanner t = new Scanner(System.in);
        System.out.println("Enter length of array");
        n = t.nextInt();
        int arr[]  = new int[n];
        System.out.println("Enter element of array");
        for(i = 0; i < n; i++) {
            arr[i] = t.nextInt();
        }
        Duplicate d = new Duplicate();
        d.bubbleSort(arr);
        int unique = d.remove(arr);
        System.out.println("Length of unique Array is " + unique);
    }
    
}

class Duplicate {
    public int remove(int [] A) {
        if(A.length < 2)
        return A.length;
        else {
            int i = 1;
            int j = 0;
            while(i < A.length) {
                if(A[i] != A[j]) {
                    j++;
                    A[j] = A[i];
                }
                i++;
            }
            return j +1;
        }
    }
    public void bubbleSort(int [] A) {
        for(int i = 0; i < A.length - 1; i++) {
            for(int j = 0; j < A.length - 1 - i; j++) {
                if(A[j] > A[j + 1]) {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
    }
}
