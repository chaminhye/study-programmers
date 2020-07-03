package solving.icj.sort;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2_2 {
    public String solution(int[] numbers) {
        String answer = "";
        
        ArrayList list = new ArrayList<String>();
        permutation(numbers, 0, numbers.length, numbers.length, list);
        
        Collections.sort(list);

        answer = (String)list.get(list.size()-1);
        
        return answer;
    }
    
    static void permutation(int[] arr, int depth, int n, int r, ArrayList list) {
		if(depth == r) {
            addNumber(arr, r, list);
			return;
		}
		
		for(int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r, list);
			swap(arr, depth, i);
		}
	}
	
	static void swap(int[] arr, int depth, int i) {
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	static void addNumber(int[] arr, int r, ArrayList list) {
        String number = "";
		for(int i = 0; i < r; i++){
            number += arr[i];            
        }
        list.add(number);
	}
}
