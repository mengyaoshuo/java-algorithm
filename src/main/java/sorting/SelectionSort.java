package sorting;

import java.util.Arrays;

public class SelectionSort {

    private static int[] sort(int... arr){
        //依次假定每一个元素是最小的，用min标注。然后在后面的元素中找比假定最小还小的，并替换。
        for(int i = 0;i<arr.length-1;i++){
            int min = i;//suppose index of the smallest element is i.
            for(int j = i + 1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            //swap arr[i] with arr[min]
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[]{10,9,7,8,6,4,5,3,2,1};
        System.out.print(Arrays.toString(sort(arr)));
    }
}