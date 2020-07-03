package solution.icj.heap;

public class Solution2_1 {

	
	public static void main(String[] args) {
		
		int stock = 4;
		int[] dates = {4, 10, 15};
		int[] supplies = {20, 5, 10};
		int k = 30;
		
		System.out.println(solution(stock, dates, supplies, k));		
	}	
	
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int len = dates.length;
        // 공급 받은 마지막 날짜
        int date = 0;
        
        // stock -= dates[0];
        // date = dates[0];
        
        // System.out.println(stock);
        // System.out.println(date);
        
        for(int i = 0; i < len; i++){
            
            // 당일 날 남은 수량
            stock -= dates[i] - date;
            
            int future;
            if(i+1 == len){
                future = k;
            }else{
                future = dates[i+1];
            }
            
            if(stock - (future - dates[i]) < 0){
                stock += supplies[i];
                date = dates[i];
                answer++;
            }
        }
        
        return answer;
    }
}
