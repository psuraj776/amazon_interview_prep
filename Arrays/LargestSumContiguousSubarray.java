/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Solution{
    
    public int largestSubarraySum(int[] ar){
            int sum=0;
            int maxSum = Integer.MIN_VALUE;
            for(int i=0;i<ar.length;i++){
                sum += ar[i];
                if(sum <= 0){
                    sum = 0;
                }
                if(sum > maxSum){
                    maxSum = sum;
                }
            }
            return maxSum;
        }
}


class LargestSum {
	public static void main (String[] args) {
		Solution solu = new Solution();
		int[] ar = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println(solu.largestSubarraySum(ar));
	}
}
