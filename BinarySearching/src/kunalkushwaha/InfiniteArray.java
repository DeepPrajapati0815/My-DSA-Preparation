package kunalkushwaha;


/*
	find target element without using the length of an array assuming array is infinite.
*/


public class InfiniteArray {
	
	public static int infiniteArraySearch(int[] arr,int target) {
		int start = 0;
		int end = 1;
		
		// check target lie in the range if not than increase the size of the chunk
		
		while(end < arr.length && target>arr[end] ) {
			int newStrat = end +1;
			
		//  end = previous end + (size of chunk * 2)
			end = end + (end - start + 1) * 2;
			start = newStrat;
		}
		
		 
		return binarySerach(arr, target, start, end);
	}

	public static int binarySerach(int[] arr,int target,int start,int end) {
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			
			if(target>arr[mid]) {
				start = mid +1;
			}
			else if(target < arr[mid]) {
				end = mid -1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {2,3,5,6,7,8,10,11,12,15,20,23,30};
		
		System.out.println(infiniteArraySearch(nums, 10));
	
	}
	
}
