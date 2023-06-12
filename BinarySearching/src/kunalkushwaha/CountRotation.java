package kunalkushwaha;

public class CountRotation {
	
	public static int peakInRotatedWithDuplicate(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(mid < end && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			
			if(mid > start && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			
			// if start , end or middle are equal 
			if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
				//check if start is pivot
				if(start < end && arr[start] > arr[start + 1]) {
					return start;
				}
				
				start++;
				if(end > start && arr[end] < arr[end - 1]) {
					return end-1;
				}
				end--;
			}
//			int[] nums = {3,4,5,5,5,0,1,2,2,2,2};
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			}else {
				end = mid -1;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {

		int[] nums = {3,4,5,5,5,0,1,2,2,2,2};
		
		int ans = peakInRotatedWithDuplicate(nums);
		
		if(ans != -1) {
			System.out.println(ans + 1);
		}
	}
}
