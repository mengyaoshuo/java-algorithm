package sorting;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {

    public static List<Integer> impFibonacci(int n){
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n);
            impFibonacci(n-1);
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println(impFibonacci(20));
    }
}
