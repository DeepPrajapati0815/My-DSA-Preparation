package kunalkushwaha;

public class CustomerMaxWealth {
	
	public static int calculateMaxWealth(int[][] accounts) {
		int max = Integer.MIN_VALUE;
		
		for(int[] person : accounts) {
			int sum = 0;
			for(int amount: person) {
				sum += amount;
			}
			
			if(sum > max) {
				max = sum;
			}
		}
		
		return max;
	}
	
	
	public static void main(String[] args) {
		int[][] accounts = {
				{1,3,5},
				{1,3,7},
				{4,2,4}
		};
		
		int ans = calculateMaxWealth(accounts);
		
		System.out.println(ans);
	}
}
