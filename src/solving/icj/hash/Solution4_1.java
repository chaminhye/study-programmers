package solving.icj.hash;

import java.util.HashMap;
import java.util.Set;

public class Solution4_1 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String, HashMap<String, Object>> genresMap = new HashMap<String, HashMap<String, Object>>();
        
        for(int i = 0; i < genres.length; i++){
            // �̹� �����ϴ� �帣���
            if(genresMap.containsKey(genres[i])){
                System.out.println("����" + genresMap.get(genres[i]));
                HashMap<String, Object> playsMap = genresMap.get(genres[i]);
                playsMap.put(String.valueOf(plays[i]), i);                    
                playsMap.put("total", (Integer)playsMap.get("total") + plays[i]);
            }else{ // �ű� �帣
                System.out.println("�ű�");
                HashMap<String, Object> playsMap = new HashMap<String, Object>();
                playsMap.put(String.valueOf(plays[i]), i);
                playsMap.put("total", plays[i]);
                genresMap.put(genres[i], playsMap);
            }
        }
        
        Set set = genresMap.entrySet();        
        System.out.println(set);
        
        return answer;
    }
}
