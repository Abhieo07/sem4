//PROGRAM TO REMOVE DUPLICATES FROM ARRAY
package JAVA;
import java.util.*;

public class removeDuplicate2 {

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
        System.out.println("Length of Array with two repeated element is " + unique);
    }
    
}

class Duplicate {
    public int remove(int [] A) {
        if(A == null)
        return 0;
        if(A.length <= 2)
        return A.length;
        else {
            int i = 1;
            int j = 2;
            while(j < A.length) {
                if(A[j] == A[i] && A[j] == A[i - 1]) {
                    j++;
                }
                else {
                    i++;
                    A[j] = A[i];
                    j++;
                }
                
            }
            return i + 1;
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
