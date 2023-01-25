#include<stdlib.h>
#include<stdio.h>

int min(int x, int y) {
    if(x > y)
    return y;
    else
    return x;
}

int trappedRain(int rating[], int n) {
    int result = 0;
    if(rating == NULL || n == 0)
    return result;
    int left[n], right[n], max;
    // left to right
    max = rating[0];
    left[0] = rating[0];
    for(int i = 1; i < n; i++) {
        if(rating[i] < max)
        left[i] = max;
        else{
            left[i] = rating[i];
            max = rating[i];
        }
    }
    //right to left
    max = rating[n - 1];
    right[n - 1] = rating[n - 1];
    for(int i = n - 2; i >= 0; i--) {
        if(rating[i] < max)
        right[i] = max;
        else{
            right[i] = rating[i];
            max = rating[i];
        }
    }
    //calculating
    for(int i = 0; i < n; i++) {
        result += min(left[i],right[i]) - rating[i];
    }
    return result;
}

int main() {

    int *A,n;
    printf("Enter length of array\n");
    scanf("%d", &n);

    A = (int*)malloc(sizeof(int)*n);
    printf("Enter ratings for each element in array\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    printf("Maximum trapped Rain: %d\n", trappedRain(A,n));
    

    return 0;
}