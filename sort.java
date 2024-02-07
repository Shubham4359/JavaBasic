/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	static void merge(int a[],int l,int m,int r){
	    int n1=(m-l)+1;
	    int n2=r-m; // r-m
	    int lt[] = new int[n1];
	    int rt[] = new int[n2];
	    for(int i=0;i<n1;i++){
	        lt[i]=a[l+i];
	    }
	    for(int i=0;i<n2;i++){
	        rt[i]=a[m+1+i];
	    }
	    int i=0,j=0;
	    int k=l;
	    while(i<n1&&j<n2){
	        if(lt[i]<rt[j]){
	        a[k]=lt[i];
	        i++;
	        }
	        else{
	       a[k]=rt[j];
	        j++;     
	        }
	        k++;
	    }
	    while(i<n1){
	        a[k++]=lt[i++];
	    }
	    while(j<n2){
	        a[k++]=rt[j++];
	    }
	}
	static void sort(int a[],int l,int r){
	    if(l<r){
	    int mid=(l+r)/2;
	    // Sort individual parts
	    sort(a,l,mid);
	    sort(a,mid+1,r);
	    merge(a,l,mid,r);
	    }
	}
	public static void main (String[] args) {
	int arr[] = {1,2,9,4,-6};
	GFG.sort(arr,0,4);
	for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i] + " ");
	}
	}
}
