package kunalkushwaha;

import java.util.Arrays;

public class FirstAndLastPosition {
	
	public static int[] findFirstAndLastOccurance(int[] arr,int target) {
		int[] ans = {-1,-1};
		
		ans[0] = search(arr,target,true);
		ans[1] = search(arr,target,false);
		
		return ans;
	}
	
	public static int search(int[] arr,int target,boolean isFirst) {
		int ans = -1;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<=end) {
			
			int mid = start + (end - start)/2;
			
			if(target>arr[mid]) {
				start = mid +1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				ans = mid;
				if(isFirst) {
					end = mid - 1;
				}
				else {
					start = mid + 1;
				}
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		
		int[] nums = {10,23,46,46,46,50,50,90};
		
		System.out.println(Arrays.toString(findFirstAndLastOccurance(nums, 46)));
	}
}
