/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		int[] a ={1,6,8,11};
		int n=4;
		int[] b ={2,5,7,12,13};
		int m=5;
		int[] c=new int[n+m];
		int k=0;
		int i=0,j=0;
		while(i<n&&j<m){
		    if(a[i]<b[j]){
		        c[k]=a[i];
		        i++;
		    }
		    else{
		        c[k]=b[j];
		        j++;
		    }
		    k++;
		}
		while(j<m){
		    c[k]=b[j];
		    j++;
		    k++;
		}
		while(i<n){
		    c[k]=a[i];
		    k++;
		    i++;
		}
		for(i=0;i<n+m;i++){
		    System.out.println(c[i]);
		}
	}
}
