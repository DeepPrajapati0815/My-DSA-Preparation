package kunalkushwaha;

public class FindMin {
	
	public static int min(int[] arr) {
		int min = Integer.MAX_VALUE;
		
		for(int elem : arr) {
			if(elem < min) {
				min = elem;
			}
		}
		
		return min;
	}
	
	 public static void main(String[] args) {
		 
		
		int[] nums = {20,43,1,3,5,7,0};
		
		int ans = min(nums);

		System.out.println("min is: " + ans);
	 }
}
