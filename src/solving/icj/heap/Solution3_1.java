package solving.icj.heap;

import java.util.PriorityQueue;

public class Solution3_1 {

	
	public static void main(String[] args) {
		
		int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
		
		System.out.println(solution(jobs));		
	}	
	
    public static int solution(int[][] jobs) {
        int answer = 0;
        int len = jobs.length;
        
        PriorityQueue<Integer> waitQueue = new PriorityQueue<Integer>();
        
        for(int i = 0; i < len; i++) {
        	waitQueue.offer(jobs[i][1]);
        }
        
        return answer;
    }
}
