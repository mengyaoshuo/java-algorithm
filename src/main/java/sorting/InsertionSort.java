package sorting;

import java.util.Arrays;

public class InsertionSort {
    //从第2个元素开始，逐一向前比较，只要j标注的元素比它之前的元素小，就交换两个元素。
    private static int[] sort(int... arr){
        for(int i = 1;i<arr.length;i++){
            for(int j = i;j >= 1 && arr[j] < arr[j-1];j--){
                //j = i,if true,conduct,and j--;
                //j = j-1,if true,conduct;if false, quit
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[]{10,9,7,8,6,4,5,3,2,1};
        System.out.print(Arrays.toString(sort(arr)));
    }
}
