/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] b ={2,5,7,7,7,12,13};
		int m=7;
		int target=7;
		int left=0;
		int right=m-1;
		int ans2=-1;
		// smallest i such that a[i]>7
		while(left<=right){
		    int mid=(left+right)/2;
		    if(b[mid]>target){
		        ans2=mid;
		        right=mid-1;
		    }
		    else if(b[mid]<=target){
		        left=mid+1;
		    }
		}
		int ans1=-1;
		left=0;
		right=m-1;
		// lower bound smallest i such that a[i]>=target
		while(left<=right){
		    int mid=(left+right)/2;
		    if(b[mid]>=target){
		        ans1=mid;
		        right=mid-1;
		    }
		    else if(b[mid]<target){
		        left=mid+1;
		    }
		}
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans2-ans1);
	}
}
