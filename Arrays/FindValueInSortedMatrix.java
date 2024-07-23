/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Solution{
    
    public int[] indexOfElement(int[][] ar, int key){
            int row = 0;
            int col = ar[0].length-1;
            
            while(row<ar.length && col>0){
                int num = ar[row][col];
                if(ar[row][col] == key){
                    return new int[] {row, col};
                }
                else if(ar[row][col] > key){
                    col = col-1;
                }
                else{
                    row = row+1;
                }
            }
            if(row<ar.length && col>0) return new int[] {row,col};
            return new int[] {-1,-1};
        }
}


class LargestSum {
	public static void main (String[] args) {
		Solution solu = new Solution();
		int[][] ar = { { 10, 20, 30, 40 },
                        { 15, 25, 35, 45 },
                        { 27, 29, 37, 48 },
                        { 32, 33, 39, 50 },
                        { 36, 44, 46, 51}     };
                        
    int[] res = solu.indexOfElement(ar, 46);
		System.out.println(res[0]+" "+res[1]);
	}
}
