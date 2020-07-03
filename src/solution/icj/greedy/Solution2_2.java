package solution.icj.greedy;

public class Solution2_2 {

	public static void main(String[] args) {

		String number = "1924";
		int k = 2;
		
//		String number = "1231234";
//		int k = 3;
		
//		String number = "1";
//		int k = 1;
		
//		String number = "4177252841";
//		int k = 4;
		
		System.out.println(solution(number, k));
	}
	
    public static String solution(String number, int k) {
        String answer = "";
        
        // k번 순회
        for(int i = 0; i < k; i++) {
        	
        	int len = number.length();
        	String max = number.substring(1);        	
        	System.out.println(max);        	
        	
        	// 각 자리 하나씩 빼면서 최대값과 비교
        	for(int j = 1; j < len; j++) {
        		System.out.println(number.substring(0, j) + number.substring(j+1));
        		String candidate = number.substring(0, j) + number.substring(j+1);
        		if(Double.parseDouble(max) < Double.parseDouble(candidate)) {
        			max = candidate;
        		}
        	}
        	number = max;
//        	System.out.println(number);
        }
        
        answer = number.equals("") ? "0" : number;
        
        return answer;
    }
}
