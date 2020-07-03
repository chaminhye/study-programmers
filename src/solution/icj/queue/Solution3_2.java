package solution.icj.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution3_2 {
	
	public static void main(String[] args) {
		
//		int[] priorities = {2, 1, 3, 2};
//		int location = 2;
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int location = 0;
		
		System.out.println(solution(priorities, location));		
		
	}
	
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int len = priorities.length;        
        int ord = 1;
        
        PriorityQueue<Integer> priQueue = new PriorityQueue<>();
        Queue<Integer> IdxQueue = new LinkedList<Integer>();
        
        for(int i = 0; i < len; i++) {
        	priQueue.offer(priorities[i]);
        	IdxQueue.offer(i);        	
        }
        
        int brk = 0;
        
        while(!priQueue.isEmpty() && brk < 7) {
        	printQueue(priQueue);
        	printQueue(IdxQueue);
        	        	
        	boolean flag = false;
        	for(int i = 1; i < priorities.length; i++) {
        		System.out.println("0 : " + priQueue.peek());
        		System.out.println(i + " : " + priorities[i]);
        		if(priorities[i] > priQueue.peek()) {
        			flag = true;
        			break;
        		}
        	}    	   
    	   
        	System.out.println("flag " + flag);
    	  
        	if(flag) {
        		priQueue.offer(priQueue.poll());
        		IdxQueue.offer(IdxQueue.poll());
        	}else {
        		priQueue.poll();
//        		System.out.println("IdxQueue.peek() " + IdxQueue.peek());
        		if(location == IdxQueue.peek()) {
        			answer = ord;
        		}
        		IdxQueue.poll();
        		ord++;
        	}
        	brk++;
        	System.out.println("================");
        }
        
        return answer;
    }
    
    public static void printQueue(Queue<Integer> queue) {
    	System.out.print("[ ");
    	queue.forEach(que -> System.out.print(que + " "));
    	System.out.println("]");
    }

}
