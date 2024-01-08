/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] arr ={10,2,20,15,5,9,8};
		int n=7;
		int[][] q={{0,3},{2,5},{4,6},{3,4}};
		int prefixsum[]=new int[n+1];
		prefixsum[0]=0;
		for(int i=0;i<n;i++){
		    prefixsum[i+1]=prefixsum[i]+arr[i];
		}
		for(int j=0;j<q.length;j++){
		int l=q[j][0];
		int r=q[j][1];
		System.out.println(prefixsum[r+1]-prefixsum[l]);
		}
	}
}
