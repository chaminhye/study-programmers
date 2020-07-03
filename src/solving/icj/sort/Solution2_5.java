package solving.icj.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Solution2_5 {
	
	public static void main(String[] args) {
		
		int[] numbers = {6, 10, 2};
//		int[] numbers = {3, 30, 34, 5, 9};
		
		System.out.println(solution(numbers));
		
	}
	
    public static String solution(int[] numbers) {
        String answer = "";      
        int len = numbers.length;
        
        Integer[] WrapperNumbers = new Integer[numbers.length]; 
        
        for(int i = 0; i < len; i++) {
        	WrapperNumbers[i] = numbers[i];
        }
        
        Arrays.sort(WrapperNumbers, new Comparator<Integer>() {
        	@Override
        	public int compare(Integer i1, Integer i2) {
        		System.out.println("changeCmpNum(i2) : "+changeCmpNum(i2));
        		System.out.println("changeCmpNum(i1) : "+changeCmpNum(i1));
        		System.out.println("===========================");
        		return changeCmpNum(i2)- changeCmpNum(i1);
//        		return i1- i2;
        	}
        });
        
        for(int i = 0; i < len; i++) {
        	answer += WrapperNumbers[i];
        }
        
        return answer;
    }
    
    private static int changeCmpNum(int num){
        int len = (int)Math.log10(num)+1;
        
//        System.out.println(len);
        
        // �� �ڸ� ��
        int cmpNum = num;
        if(len == 2){ // �� �ڸ� ��
            cmpNum = num * 10 + num - num / 10 * 10 ;
        }else if(len == 1){ // �� �ڸ� ��
            cmpNum = num * 100 + num * 10 + num;
        }
//        System.out.println(cmpNum);
        return cmpNum;
    }
}
