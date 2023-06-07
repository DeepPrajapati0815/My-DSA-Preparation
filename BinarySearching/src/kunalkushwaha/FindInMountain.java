package kunalkushwaha;

/*

* first find the peak element in mountain array
* look target element in part of ascending
* if not found than look target element in part of descending
*/


public class FindInMountain {

	public static int peakInMountain(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start<end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > arr[mid + 1]) {
				end = mid;
			}
			else {
				start = mid + 1;
			}
		}
		return start;
	}
	
	
	public static int orderOgnasticBS(int[] arr,int target,int start,int end,boolean isAsc) {
		
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(isAsc) {
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
			else {
				if(target < arr[mid]) {
					start = mid +1;
				}
				else if(target > arr[mid]) {
					end = mid - 1;
				}
				else {
					return mid;
				}
			}
		}
		
		return -1;
	}
	
	public static int search(int[] arr,int target) {
		int peak = peakInMountain(arr);
		int firstTry = orderOgnasticBS(arr, target, 0, peak, true);
		if(firstTry != -1) {
			return firstTry;
		}
		
		return orderOgnasticBS(arr, target, peak + 1, arr.length - 1, false);
	}
	
	public static void main(String[] args) {
		int[] nums = {2,4,6,8,5,3,1};
		System.out.println(search(nums,3));	
	}

}
