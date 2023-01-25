// REMOVE DUPLICATE ELEMENT IN  ARRAY
#include<stdio.h>
#include<stdlib.h>

int removeDup(int arr[], int n) {
    if(n==1) 
    return 1;
    else {
        int i, j;
        j = 0;
        i = 1;
        while(i < n) {
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            } 
            i++;
        }
        return j + 1;
    }
    
}


void bubbleSort(int A[], int n) {
    int i, j ,temp;
    for(i = 0; i < n - 1; i++) {
        for(j = 0; j < n - i - 1; j++) {
            if(A[j] > A[j + 1]) {
                temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
        }
    }
}

int main() {

    int n, *A;
    printf("Enter number of array\n");
    scanf("%d", &n);
    A = (int *)malloc(sizeof(int)*n);
    printf("Enter element in Array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }
    
    bubbleSort(A,n);
    
    int length = removeDup(A,n);
    printf("Length of unique array is: %d \n", length);


    return 0;
}