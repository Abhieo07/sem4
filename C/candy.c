#include<stdlib.h>
#include<stdio.h>

int max(int x, int y) {
    if(x > y)
    return x;
    else
    return y;
}

int candies(int rating[], int n) {
   if(rating == NULL || n == 0)
   return 0;
   int candies[n],cur;
   candies[0] = 1;
   // left to right
   for(int i = 1; i < n; i++) {
    if(rating[i] > rating[i -1])
    candies[i] = candies[i - 1] + 1;
    else
    candies[i] = 1;
   }
   int result = candies[n - 1];
   //right to left
   for(int i = n - 2; i >= 0; i--) {
    cur = 1;
    if(rating[i] > rating[i + 1])
    cur = candies[i + 1] + 1;
    result += max(cur, candies[i]);
    candies[i] = cur;
   }
   return result;
}

int main() {

    int *A,n;
    printf("Enter number of Childrens\n");
    scanf("%d", &n);

    A = (int*)malloc(sizeof(int)*n);
    printf("Enter ratings for each children\n");
    for(int i = 0; i < n; i++) {
        scanf("%d", &A[i]);
    }

    int candy = candies(A,n);
    printf("Minimum number of candies required: %d\n", candy);
    

    return 0;
}