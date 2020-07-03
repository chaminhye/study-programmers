package solving.icj.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2_4 {
    public String solution(int[] numbers) {
        String answer = "";
        
        sort(numbers, 0, numbers.length-1);
        
        for(int i = numbers.length-1; i >= 0; i--){            
            answer += numbers[i];
        }
        
        // System.out.println(answer);
        
        return answer;
    }
    
    private static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = partition(arr, low, high);
        sort(arr, low, mid - 1);
        sort(arr, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = changeCmpNum(arr[(low + high) / 2]);
        while (low <= high) {
            while (changeCmpNum(arr[low]) < pivot) low++;
            while (changeCmpNum(arr[high]) > pivot) high--;
            if (low <= high) {
                swap(arr, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    private static int changeCmpNum(int num){
        int len = (int)Math.log10(num)+1;
        // �� �ڸ� ��
        int cmpNum = num;
        if(len == 2){ // �� �ڸ� ��
            cmpNum = num * 10 + num - num / 10 * 10 ;
        }else if(len == 1){ // �� �ڸ� ��
            cmpNum = num * 100 + num * 10 + num;
        }
        // System.out.println(cmpNum);
        return cmpNum;
    }
}
