package solving.icj.bruteForceSearch;

import java.util.Arrays;

public class Solution2_3 {
	
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
        boolean[] visit = new boolean[len];
        int[] res = new int[len];
        
    
        for(int i = 0; i < len; i++) {
        	reComArr[i] = Integer.parseInt(strArr[i]);
        }

        solve3(reComArr, n, r, 0, 0, res);
        solve4(reComArr, n, r, 0, 0, res, visit);
        
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
    
    //조합: 순서가 중요하지 않고(123==321), 중복을 허용하지 않는 경우
    private static void solve4(int[] data, int n, int r, int depth, int start, int[] res, boolean[] visit) {
        if (depth == r) {
            System.out.println(Arrays.toString(res));
//            cnt++;
            return;
        }

        for (int i = start; i < n; i++) {
            if (visit[i] == false) {
                visit[i] = true;
                res[depth] = data[i];
                solve4(data, n, r, depth + 1, i, res, visit);
                visit[i] = false;
            }
        }
    }
}
