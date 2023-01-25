package JAVA;
import java.util.*;

public class candy {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter number of Childrens");
        int N = t.nextInt();
        int ratings [] = new int[N];
        System.out.println("Enter ratings for each children");
        int i = 0;
        while(i < N) {
            ratings[i] = t.nextInt();
            i++;
        }
        total c = new total();
        int candy = c.numberOfCandies(ratings);
        System.out.println("Minimum number of candies "+ candy);
    }
}

class total {
    public int numberOfCandies(int [] ratings) {
        if(ratings == null || ratings.length == 0)
        return 0;

        int candies [] = new int[ratings.length];
        candies[0] = 1;
//FROM LEFT TO RIGHT
        for(int i = 1; i < ratings.length ; i++) {
            if(ratings[i] > ratings[i - 1])
            candies[i] = candies[i - 1] + 1;
            else
            candies[i] = 1;
        }

        int result = candies[ratings.length - 1];

//FROM RIGHT TO LEFT
        for(int i = ratings.length - 2; i >= 0; i--) {
            int cur = 1;
            if(ratings[i] > ratings[i + 1])
            cur = candies[i + 1] + 1;

            result += Math.max(cur, candies[i]);
            candies[i] = cur;
        }

        return result;
    }
}