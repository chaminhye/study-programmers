package solving.icj.greedy;

import java.util.Arrays;

public class Solution2_1 {

	public static void main(String[] args) {
		
		String number = "1231234";
		int k = 3;
		
		System.out.println(solution(number, k));
	}
	
    public static String solution(String number, int k) {
        String answer = "";
        int len = number.length();    
        String[] originNumArr = number.split("");
        String[] sortedNumArr = originNumArr.clone();
        String[] filteredNumArr = new String[k];
        
        Arrays.sort(sortedNumArr);
        
        for(int i = 0; i < k; i++) {
//        	System.out.println(sortedNumArr[i]);
        	filteredNumArr[i] = sortedNumArr[i];
        }        
        
        for(int i = 0; i < len; i++) {

        	boolean isAdd = true;
        	
        	for(int j = 0; j < k; j++) {        		
        		
        		// 빼야할 숫자
        		if(originNumArr[i].equals(filteredNumArr[j])) {
        			filteredNumArr[j] = "10";
        			isAdd = false;
        			break;
        		}
        	}
        	if (isAdd) {
        		answer += originNumArr[i];
        	}
        }
        
        return answer;
    }
}
