package kunalkushwaha.assignment;

import java.util.Arrays;

public class TwoSum {
	
	public static int[] findTwoSumOfTarget(int[] arr,int target) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start <= end) {
			int sum = arr[start] + arr[end];
			
			if(sum == target) {
				return new int[] {start + 1,end + 1};
			}
			else if(sum > target) {
				end--;
			}
			else {
				start++;
			}
		}
		
		return new int[]{-1,-1};
		
	}
	
	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 18;
		
		int[] ans = findTwoSumOfTarget(nums,target);
		System.out.println(Arrays.toString(ans));
	}
}
