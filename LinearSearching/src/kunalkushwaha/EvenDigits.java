package kunalkushwaha;

public class EvenDigits {

	public static int findEvenNumbers(int[] arr) {
		int count = 0;
		
		for(int num: arr) {
			if(even(num)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean even(int num) {
		return digits2Method(num) % 2 == 0;
	}
	
	public static int digits2Method(int num) {
		if(num < 0) {
			num *= -1;
		}
		return (int)(Math.log10(num) + 1);
	}
	
	public static int digits(int num) {
		
		if(num < 0) {
			num *= -1;
		}
		
		int count= 0;
		
		while(num > 0) {
			count++;
			num/=10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,234,55,5,4356,8};
		int ans = findEvenNumbers(nums);
		System.out.println(ans);
	}
}
