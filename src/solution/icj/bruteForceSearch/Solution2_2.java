package solution.icj.bruteForceSearch;

import java.util.Arrays;

public class Solution2_2 {
	
	public static void main(String[] args) {
		
		String numbers = "17";
		
		solution(numbers);		
	}
	
    public static int solution(String numbers) {
        int answer = 0;
        int len = numbers.length();
        int n = len;
        int r = len;
        
        String[] strArr = numbers.split("");
        
        int[] reComArr = new int[len];
        int[] res = new int[len];
    
        for(int i = 0; i < len; i++) {
        	reComArr[i] = Integer.parseInt(strArr[i]);
        }

        solve3(reComArr, n, r, 0, 0, res);
        
        return answer;
    }
    
    //중복조합: 순서가 중요하지 않고(123==321), 중복을 허용하는 경우
    private static void solve3(int[] data, int n, int r, int depth, int start, int[] res) {
        if (depth == r) {
            System.out.println(Arrays.toString(res));
//            cnt++;
            return;
        }

        for (int i = start; i < n; i++) {
            res[depth] = data[i];
            solve3(data, n, r, depth + 1, i, res);
        }
    }
}
