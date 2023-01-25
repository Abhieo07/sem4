#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

int min(int x, int y) {
    if(x > y)
    return y;
    else
    return x;
}

int minSumSubarraywithSize(int arr[], int n, int s) {
    if(arr == NULL || n == 0)
    return 0;
    int result = n, start = 0, sum = 0, i = 0;
    bool exists = 0;

    while(i <= n) {
        if(sum>=s) {
            exists = 1;
            if(start == i - 1)
            return 1;

            result = min(result, i - start);
            sum = sum - arr[start];
            start ++;
        }
        else {
            if(i == n)
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

int main() {
    int n, s, *A;
    printf("Enter number of elements in array and minimum sum\n");
    scanf("%d%d",&n, &s);
    A = (int*)malloc(sizeof(int)*n);
    printf("Enter elements in Array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    printf("Subarray with minimum sum: %d", minSumSubarraywithSize(A, n, s));

    return 0;
}