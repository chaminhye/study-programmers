package solving.icj.hash;

public class Solution2_1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i = 0; i < phone_book.length; i++){
            int cnt = 0;
            for(int j = 0; j < phone_book.length; j++){
                if(phone_book[j].startsWith(phone_book[i])){
                    cnt++;
                }
            }
            if(cnt > 1){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}
