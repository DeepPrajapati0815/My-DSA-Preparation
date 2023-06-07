package kunalkushwaha;

/*
	- find peak or pivot(max) in rotated array
	- first search in first half of the array from 0 to peak
	- if not found than search element in second half of the array from peak + 1 to length;
*/

public class SearchInRotated {
	
	public static int peakInRotated(int[] arr) {
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
			
			if(arr[start] >= arr[mid]) {
				end = mid -1;
			}
			else {
				start = mid + 1;
			}
		}
		return -1;
	}
	
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
			else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
				start = mid + 1;
			}else {
				end = mid -1;
			}
		}
		return -1;
	}
	
	

	
	
	public static int binarySearch(int[] arr, int target,int start,int end) {
		if (arr.length == 0) {
			return -1;
		}

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

			if (target == arr[mid]) {
				return mid;
			}
		}

		return -1;
	}
	
	public static int search(int[] arr,int target) {
		int pivot = peakInRotatedWithDuplicate(arr);
		


        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0 , arr.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length - 1);}
	
	public static void main(String[] args) {
		int[] nums = {1,2,4,8};
		
		System.out.println(search(nums,8));
	}
}



