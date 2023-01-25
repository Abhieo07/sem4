// REMOVE DUPLICATE ELEMENT IN  ARRAY
#include<stdio.h>
#include<stdlib.h>

int removeElement(int arr[], int n, int ele) {
    if(n==1) 
    return 1;
    else {
        int i, j;
        j = 0;
        i = 0;
        while(j < n) {
            if(arr[j] != ele) {
                i++;
            } 
            j++;
        }
        return i;
    }
    
}


int main() {

    int n, ele, *A;
    printf("Enter number of array and element to remove\n");
    scanf("%d%d", &n, &ele);
    A = (int *)malloc(sizeof(int)*n);
    printf("Enter element in Array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }
    
    
    int length = removeElement(A,n,ele);
    printf("Length of array is: %d \n", length);


    return 0;
}