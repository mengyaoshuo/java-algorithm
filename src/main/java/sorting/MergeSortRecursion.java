package sorting;

import java.util.Arrays;

public class MergeSortRecursion {
    //排序
    private static int[] sort(int head, int tail, int... arr){
        if(head >= tail) {
            return arr;
        }
        int mid = (head + tail)/2;
        sort(head,mid,arr);
        sort(mid + 1,tail,arr);
        merge(head,mid,tail,arr);
        return arr;
    }
    //把排好序的两个数组merge
    private static void merge(int head,int mid,int tail,int... arr){
        int i = head, j = mid + 1;
        int[] temp = new int[arr.length];
        for(int k = 0;k <= tail; k++){
            temp[k] = arr[k];
        }
        for(int k = head; k <= tail; k++){
            if(i > mid){
                arr[k] = temp[j++];
            }else if(j > tail){
                arr[k] = temp[i++];
            }else if(temp[j] < temp[i]){
                arr[k] = temp[j++];
            }else{
                arr[k] = temp[i++];
            }
        }
    }
    public static void main(String[] args){
        int[] arr = new int[]{3,2,1,0};
        System.out.print(Arrays.toString(sort(0,3,arr)));
    }
}
