package solving.icj.bruteForceSearch;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Solution3_2 {
	
	public static void main(String[] args) {
		int[][] baseball = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		
		System.out.println(solution(baseball));
	}
	
    public static int solution(int[][] baseball) {
        int answer = 0;
        List<String> candidates = new LinkedList<String>();

        // 후보들 생성
        for(int i = 1; i <= 9; i++) {
        	for(int j = 1; j <= 9; j++) {
        		if(j != i) {
        			for(int k = 1; k <= 9; k++) {
        				if(k != i && k != j) {
        					int num = i * 100 + j * 10 + k;
        					candidates.add(String.valueOf(num));        
//        					System.out.println(num);
        				}
        			}
        		}
        	}        	
        }
        
        for(Iterator<String> iter = candidates.iterator(); iter.hasNext();) {
        	String candidate = iter.next();
        	
//        	System.out.println("candidate : " + candidate);
        	
        	// 시도한 baseball 순회
        	for(int j = 0; j < baseball.length; j++) {
        		String tryNum = String.valueOf(baseball[j][0]);
        		int strike = 0;
        		int ball = 0;
        		
        		// 스크라이크 개수 체크
        		for(int k = 0; k <= 2; k++) {
        			if(candidate.charAt(k) == tryNum.charAt(k)) {
        				strike++;
        			}
        		}
        		        		
        		// 볼 체크
        		for(int k = 0; k <= 2; k++) {
            		for(int l = 0; l <= 2; l++) {
            			if(tryNum.charAt(l) == candidate.charAt(k)) {
            				ball++;
            			}
            		}
        		}
        		
        		ball -= strike;
        		
//        		// 틀린 후보 제거
        		if(baseball[j][1] != strike || baseball[j][2] != ball) {
            		iter.remove();
        			break;
        		}
        	}
        }
        
        answer = candidates.size();
        
        return answer;
    }
}
