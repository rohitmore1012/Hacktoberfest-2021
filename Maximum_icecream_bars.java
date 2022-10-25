/* It is a sweltering summer day, and a boy wants to buy some ice cream bars.

At the store, there are n ice cream bars. You are given an array costs of length n, where costs[i] is the price of the ith ice cream bar in coins. 
The boy initially has coins coins to spend, and he wants to buy as many ice cream bars as possible. 

Return the maximum number of ice cream bars the boy can buy with coins coins.
*/

import java.util.*;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of ice-cream bars: ");
	    int n = sc.nextInt();
	    int[] costs = new int[n];
	    System.out.println("Enter the price of each ice-cream bar: ");
	    for(int i=0;i<n;i++){
	        costs[i]=sc.nextInt();
	    }
	    System.out.println("Enter the number of coins the boy has: ");
	    int coins = sc.nextInt();
	    Arrays.sort(costs);
        int[] sum = new int[n];
        sum[0]=costs[0];
        for(int i=1;i<n;i++){
            sum[i] =costs[i]+sum[i-1];
        }
        int i=0;
        while(i<n && sum[i]<=coins){
            i++;
        }
        System.out.println("Maximum number of ice cream bars the boy can buy: "+i);
    }

}
