package solving.icj.test;

public class Test {
	public static void main(String[] args) {
		System.out.println("test");
		
		int[] numbers = {3, 30, 34, 5, 9};
		
		String num = "";
		
        for(int i = 0; i < numbers.length; i++){
            num += numbers[i];
        }
        
        System.out.println(Integer.parseInt(num));
        String num2 = "323223233324";
        System.out.println(Integer.parseInt(num2));
	}
}
