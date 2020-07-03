package solution.icj.hash;

import java.util.HashMap;

public class Solution3_1 {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String[] item : clothes){
            String name = item[0];
            String clasf = item[1];
            // ���� ������ �ִٸ�
            if(map.containsKey(clasf)){
                map.put(clasf, map.get(clasf)+1);                
            }else{ // �ٸ� �������
                map.put(clasf, 1);
            }
        }
        
//         Set set = map.entrySet();
//         System.out.println(set);
        
        for(String key : map.keySet()){
            answer *= map.get(key)+1;
        }
        
        answer--;
        
        return answer;
    }
}
