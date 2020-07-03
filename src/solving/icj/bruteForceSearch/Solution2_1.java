package solving.icj.bruteForceSearch;

import java.util.ArrayList;
import java.util.List;

public class Solution2_1 {

	public static void main(String[] args) {
		
		String numbers = "17";
		
		solution(numbers);
		
	}
	
    public static int solution(String numbers) {
        int answer = 0;
        int len = numbers.length();
        boolean[] visited = new boolean[len];
        
        String[] strArr = numbers.split("");
        int[] comArr = new int[len]; 
//        int[] temp = new int[];
        
        for(int i = 0; i < len; i++) {
        	comArr[i] = Integer.parseInt(strArr[i]);
        }
        
        for (int i = 1; i <= len; i++) {
            combination(comArr, visited, 0, len, i);
        }
        
        return answer;
    }
    
    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }
    
    // 배열 출력
    static void print(int[] arr, boolean[] visited, int n) {
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
