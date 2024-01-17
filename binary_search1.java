/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] b ={2,5,7,12,13};
		int m=5;
		int target=14;
		int left=0;
		int right=m-1;
		int ans=-1;
		while(left<=right){
		    int mid=(left+right)/2;
		    if(b[mid]>=target){
		        ans=mid;
		        right=mid-1;
		    }
		    else if(b[mid]<target){
		        left=mid+1;
		    }
		}
		System.out.println(ans);
	}
}
