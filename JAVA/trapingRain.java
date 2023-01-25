package JAVA;
import java.util.*;

public class trapingRain {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter legth of graph");
        int N = t.nextInt();
        int ratings [] = new int[N];
        System.out.println("Enter graph rating");
        int i = 0;
        while(i < N) {
            ratings[i] = t.nextInt();
            i++;
        }
        traping c = new traping();
        int rain = c.Rainwater(ratings);
        System.out.println("Maximum traped Rainwater "+ rain);
    }
}

class traping {
    public int Rainwater(int [] height) {
        int result = 0;
        if(height == null || height.length == 0)
        return result;

        int left [] = new int[height.length];
        int right [] = new int[height.length];
        int max = height[0];
        left[0] = height[0];
//FROM LEFT TO RIGHT
        for(int i = 1; i < height.length ; i++) {
            if(height[i] < max)
            left[i] = max;
            else{
            left[i] = height[i];
            max = height[i];}
        }

        

//FROM RIGHT TO LEFT
        max = height[height.length - 1];
        right[height.length - 1] = height[height.length - 1];
        for(int i = height.length - 2; i >= 0; i--) {
            if(height[i] < max)
            right[i] = max;
            else{
            right[i] = height[i];
            max = height[i];}
        }
//RESULT CALCULATION
        for(int i = 0; i < height.length; i++) {
            result += Math.min(left[i], right[i]) - height[i];
        }

        return result;
    }
}