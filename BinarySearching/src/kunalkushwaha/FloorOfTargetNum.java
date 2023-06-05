package kunalkushwaha;


/*
- Floor of number = greatest element in array smaller or equal(=) to target.

- if target == mid than it simply return the mid because it is equal to target but
 
- if not after condition is break or violated the end will be mid - 1 
  which is always smaller than target and greater element 
  
- so if the target is not found we just return end instead of -1.

- return -1 when the target is smaller than the smallest element in array

*/

public class FloorOfTargetNum {
	
	public static int floor(int[] arr,int target) {
		
		if(target < arr[0]) {
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
		
		return end;
	}

	public static void main(String[] args) {
		int[] nums = {10,23,54,76,89,98,100};
		int target = 12;
		int ans = floor(nums, target);
		
		System.out.println(ans);
	

	}

}
