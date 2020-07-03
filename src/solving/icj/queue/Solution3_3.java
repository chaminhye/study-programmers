package solving.icj.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution3_3 {
	
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
        
        PriorityQueue<Integer> priQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> IdxQueue = new LinkedList<Integer>();
        
        for(int i = 0; i < len; i++) {
//        	System.out.println("priorities[i] " + priorities[i]);
        	priQueue.offer(priorities[i]);
        	IdxQueue.offer(i);
        }
        
        while(!priQueue.isEmpty()) {
        	
        	printQueue(priQueue);
        	printQueue(IdxQueue);
        	
        	System.out.println("priorities[IdxQueue.peek()] " + priorities[IdxQueue.peek()]);
        	System.out.println("priQueue.peek() " + priQueue.peek());
        	
        	if(priorities[IdxQueue.peek()] < priQueue.peek()) {
        		System.out.println("����");
        		priQueue.offer(priQueue.poll());
        		IdxQueue.offer(IdxQueue.poll());
        	}else {
        		System.out.println("�̱�");
        		priQueue.poll();
        		IdxQueue.poll();
        		answer++;
        		if(IdxQueue.peek() == location) {
        			break;
        		}
        	}
        	
        	System.out.println("================");
//        	break;
        }
        
        return answer;
    }
    
    public static void printQueue(Queue<Integer> queue) {
    	System.out.print("[ ");
    	queue.forEach(que -> System.out.print(que + " "));
    	System.out.println("]");
    }

}
