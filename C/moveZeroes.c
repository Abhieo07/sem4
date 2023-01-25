#include<stdlib.h>
#include<stdio.h>

void moveZero(int arr[], int n) {
    int i = 0;
    int j = 0;

    while(j < n) {
        if(arr[j] == 0)
        j++;
        else {
            arr[i] = arr[j];
            i++;
            j++;
        }
    }
    while(i < n) {
        arr[i] = 0;
        i++;
    }
}

int main() {

    int *A,n;
    printf("Enter length of array\n");
    scanf("%d", &n);

    A = (int*)malloc(sizeof(int)*n);
    printf("Enter element in array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    moveZero(A,n);
    for(int i = 0; i < n; i++) {
        printf("%d\t", A[i]);
    }

    return 0;
}