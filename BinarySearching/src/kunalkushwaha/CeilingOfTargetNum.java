package kunalkushwaha;

/*
	- Ceiling of number = smallest element in array greater or equal(=) to target.
	
	- if target == mid than it simply return the mid because it is equal to target but
	 
	- if not after condition is break or violated the start will be mid + 1 
	  which is always greater than target and smaller element 
	  
	- so if the target is not found we just return start instead of -1.
	
	- return -1 when the target is greater than the greatest element in array

*/
public class CeilingOfTargetNum {

	
	
	public static int ceiling(int[] arr,int target) {
		
		if(target > arr[arr.length - 1]) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(target > arr[mid]) {
				start = mid + 1;
			}
			else if(target < arr[mid]) {
				end = mid - 1;
			}
			else {
				return mid;
			}
		}
		
		return start;
	}
	
	public static void main(String[] args) {
		int[] nums = {10,23,54,76,89,98,100};
		int target = 74;
		int ans = ceiling(nums, target);
		
		System.out.println(ans);
	}

}
