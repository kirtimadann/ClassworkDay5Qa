package com.bl.Day5;
import java.util.*;
//I/P -> The number of times to Flip Coin. Ensure it is a positive integer.
//b. Logic -> Use Random Function to get value between 0 and 1. If < 0.5 then tails or
//heads
//c. O/P -> Percentage of Head vs Tails
public class FlipCoinPresentage {
   static int number;
    int tails = 0;
    int head = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        number = sc.nextInt();
        FlipCoinPresentage obj = new FlipCoinPresentage();
      for (int i = 0; i <number; i++){

          double random = (Math.random());

          if (number<0.5) {

              obj.tails++;

          }else {

              obj.head++;

          }

      }
   double percentage = (obj.tails / number) * 100;
      double per_head =(obj.head/number)*100;

        System.out.println("Tail Percentage :" +percentage);
        System.out.println("Head Percentage :" +per_head);

    }
}
