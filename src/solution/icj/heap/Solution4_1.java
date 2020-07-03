package solution.icj.heap;

public class Solution4_1 {

	public static void main(String[] args) {
		
		String[] operations = {"I 16", "D 1"};
		
		int[] ans = solution(operations);
		
		for(int num : ans) {
			System.out.println(num);
		}
	}
	
    public static int[] solution(String[] operations) {
        int[] answer = {};
        
        for(int i = 0; i < operations.length; i++) {
        	String[] oper = operations[i].split(" ");
        	
        	if("I".equals(oper[0])) {
        		System.out.println("삽입");
        	}else {
        		if("1".equals(oper[1])) {
        			System.out.println("최댓값 제거");        			
        		}else {
        			System.out.println("최솟값 제거");
        		}
        	}
        	
        }
        
        return answer;
    }
}
