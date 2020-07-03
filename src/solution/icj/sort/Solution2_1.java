package solution.icj.sort;

import java.util.Arrays;

public class Solution2_1 {
    public String solution(int[] numbers) {
        String answer = "";
        int len = numbers.length;
        int tmp;
        int max;
        
        for(int i = 0; i < len-1; i++){
            max = i;
            for(int j = i+1; j < len; j++){               
                // if(changeCmpNum(numbers[j]) > changeCmpNum(numbers[max])){
                //     max = j;
                // }
                if(Integer.parseInt(numbers[j] + "" + numbers[max]) > Integer.parseInt(numbers[max] + "" + numbers[j])){
                    max = j;
                }
            }
            tmp = numbers[max];            
            numbers[max] = numbers[i];
            numbers[i] = tmp;            
        }
        
//         StringBuffer str = new StringBuffer(answer);
        
//         for(int number : numbers){
//             // answer += number;
//             str.append(number);
//         }
//         answer = str.toString();
        String str = Arrays.toString(numbers);
        answer = str.substring(1,str.length()-1).replace(", ","");
        
        return answer;
    }
    
    int changeCmpNum(int num){
        int len = (int)Math.log10(num)+1;
        int cmpNum = num;
        if(len == 1){
            cmpNum = num * 100 + num * 10 + num;
        }else if(len == 2){
            cmpNum = num * 10 + num / 10 % 10;
        }
        return cmpNum;
    }
}
