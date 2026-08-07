// Leetcode 34: find first and last position of an element in a sorted array 

import java.util.Arrays;

public class Demo {
    public static void main(String [] args){
        int [] arr={1,2,4,6,7,9,9,23,45,66,78,99};
        int target=9;
        Demo d=new Demo();
        System.out.println(Arrays.toString(d.search(arr,target)));

    }
    public int[] search(int[] arr,int target){
        int start=get(arr,target,true);
        int end=get(arr,target,false);
        return new int[]{start,end};
    }
    public int get(int[] arr,int target, boolean firstElement){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                ans=mid;
                if(firstElement){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        
        }
        return ans;
    }
}
