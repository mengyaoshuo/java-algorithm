package sorting;

import java.util.Arrays;

public class ShellSort {
    //Reference:https://www.runoob.com/data-structures/shell-sort.html
    private static int[] sort(int... arr){

        int h = arr.length/2;
        while(h > 0){
            //i从第1组的第二个元素开始走，一直走到最后。j=i，并实现arr[i]与arr[i-h]的比较和交换。
            for(int i = h; i < arr.length; i++){
                for( int j = i ; j >= h && arr[j] < arr[j - h];j -= h){
                    int temp = arr[j];
                    arr[j] = arr[j-h];
                    arr[j-h] = temp;
                }
            }
            h = h/2;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = new int[]{10,9,7,8,6,4,5,3,2,1};
        System.out.print(Arrays.toString(sort(arr)));
    }
}
