package solving.icj.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1_1 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int time = 0;
        int i = 0;
        int cnt = 0;
        
        Queue<Integer> onBridge = new LinkedList<Integer>();
        
        while(cnt < truck_weights.length){
            Integer totalWgt = 0;
            
            // �ٸ� ���� ������� üũ
            if(!onBridge.isEmpty()){
                // ���� ���� �ٸ� �ǳ�
                if(time % bridge_length == 0){
                    onBridge.poll();
                    cnt++;
                }
                // �ٸ� ���� �ִ� Ʈ������ �� ����
                for(Integer wgt : onBridge){
                    totalWgt += wgt;
                }
            }
                        
            // ���ο� Ʈ���� �ø��� �ִ���
            if(i < truck_weights.length){
                
                System.out.println(totalWgt);
                System.out.println(truck_weights[i]);
                
                if(totalWgt + truck_weights[i] <= weight){
                    // �ٸ��� �ö�
                    onBridge.offer(truck_weights[i++]);
                }                
            }
            
            time++;
            System.out.println("time :" + time);
            System.out.println("i :" + i);
            System.out.println("cnt :" + cnt);
            System.out.println("===============");
        }
        
        return time;
    }
}
