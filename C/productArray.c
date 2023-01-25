//PROGRAM TO GET PRODUCT OF ALL ELEMENTS IN ARRAY EXCEPT SELF
#include<stdio.h>
#include<stdlib.h>

void product(int arr[], int n) {
    int temp1[n], temp2[n];
    temp1[0] = 1;
    temp2[n-1] = 1;

    //left to right 
    for(int i = 0; i < n-1; i++) {
        temp1[i + 1] = temp1[i] * arr[i];
    }
    //right to left
    for(int i = n - 1; i > 0; i--) {
        temp2[i - 1] = temp2[i] * arr[i];
    }
    //calculating multiplication
    for(int i = 0; i < n; i++) {
        arr[i] = temp1[i] * temp2[i];
    }
}

int main() {
    int n, *A;
    printf("Enter number of elements in array\n");
    scanf("%d",&n);
    A = (int*)malloc(sizeof(int)*n);
    printf("Enter elements in Array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    product(A,n);
    printf("Product of elements in array except self\n");
    for(int i = 0; i < n; i++) {
        printf("%d\t", A[i]);
    }

    return 0;
}