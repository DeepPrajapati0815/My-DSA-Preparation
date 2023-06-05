package kunalkushwaha;

/*
 *  binary search algorithm works in sorted array ascending/descending
	
 
  - it first find the middle element

  - then check target > mid => yes -> search in right side 
	else search in left side 
  
  - check target == mid => yes -> target is found 

  - continue finding middle until target is not found
  
*/

public class Main {

	public static int binarySearch(int[] arr, int target) {
		if (arr.length == 0) {
			return -1;
		}

		int start = 0;
		int end = arr.length - 1;

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

	public static int orderOgnasticBinarySearch(int[] arr,int target) {
		
		if(arr.length == 0) {
			return -1;
		}	
		
		int start = 0;
		int end = arr.length - 1;
		
		boolean isAsc = arr[start] < arr[end];
				
			while(start <= end) {
				int mid = start + (end - start )/ 2;
				

				if(isAsc) {
					if(target > arr[mid]) {
						start = mid +1;
					}
					else if(target<arr[mid]){
						end = mid - 1;
					}else {
						return mid;
					}
				}
				else {
					if(target > arr[mid]) {
						end = mid - 1;
					}
					else if(target < arr[mid]){
						start = mid +1;
					}
					else{
						return mid;
					}
				}		
			}
		
			return-1;
	}

	public static void main(String[] args) {
		
		int[] nums = {10,23,54,76,89,98,100};
		int[] descNums = {98,93,84,76,64,23,21,11,4};
		
		int target = 76;
		
		int ans = binarySearch(nums,target);
		int ansOfDesc = orderOgnasticBinarySearch(descNums,target);
		
		System.out.println(ans);

		System.out.println(ansOfDesc);
	}

}
