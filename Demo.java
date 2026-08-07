// Leetcode 34: find first and last position of an element in a sorted array 

import java.util.Arrays;

public class Demo {
    public static void main(String [] args){
        int [] arr={1,2,4,6,7,9,9,23,45,66,78,99};
        int target=99;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        int s=-1;
        int e=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                s=i;
                break;
            }
        }for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                e=i;
                break;
            }
        }
        return new int[]{s,e};
    }
}
