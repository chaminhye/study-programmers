package solving.icj.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution4_2 {
	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		
		System.out.println(solution(genres, plays));
	}
	
	// CMHǮ��
    public static int[] solution(String[] genres, int[] plays) {
        HashMap<String,Integer> typeMap = new HashMap<String, Integer>();
      for(int i=0; i<genres.length;i++) {
         typeMap.put(genres[i], 0);
      }
        
        int[] answer = new int[typeMap.size()*2];
      Map map = new HashMap();
      for (int i = 0; i < genres.length; i++) {
         map.put(genres[i] + i, plays[i]);
      }

      String[] arr = new String[genres.length];
      
      List<String> list = new ArrayList<String>();
      map.entrySet().stream().sorted(Map.Entry.comparingByValue().reversed())
      .forEach(x -> {
         Map.Entry<String, Integer> tmp = (Map.Entry<String, Integer>) x;

          list.add(tmp.getKey());
       
      });

      HashMap<String,Integer> resultMap = new HashMap<String, Integer>();
      for(int i=0;i<list.size();i++) {
         //System.out.println(list.get(i) +"  : "+Integer.parseInt(list.get(i).substring(list.get(i).length()-1, list.get(i).length())));
         resultMap.put(list.get(i).substring(0, list.get(i).length()-1), resultMap.getOrDefault(list.get(i).substring(0, list.get(i).length()-1), 0)+1);
         if(resultMap.get(list.get(i).substring(0, list.get(i).length()-1)) <3) {
            //System.out.println(i +" : "+Integer.parseInt(list.get(i).substring(list.get(i).length()-1, list.get(i).length())));
            answer[i] = Integer.parseInt(list.get(i).substring(list.get(i).length()-1, list.get(i).length()));
         }
      }
        
        
        return answer;

    }
}
