package kunalkushwaha;

public class Main {


	//this method returns index if element found else return -1 beacuse it can not be index of array
	public static int linearSearch(int[] arr,int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	

	//this method returns element if element found else return integer max value
	public static int linearSearch1(int[] arr,int target) {
		if(arr.length == 0) {
			return Integer.MAX_VALUE;
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				return arr[i];
			}
		}
		
		return Integer.MAX_VALUE;
	}
	
	
	//this method returns true if element found else return false
	public static boolean linearSearch2(int[] arr,int target) {
		if(arr.length == 0) {
			return false;
		}
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == target) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] nums = new int[] {19,43,23,5,1,45,3};
		int target = 23;
		
		int ans = linearSearch(nums, target);
		System.out.println("target found at index: " + ans);
		
		ans = linearSearch1(nums,target);
		System.out.println("target found: " + ans);
		
		
		boolean result = linearSearch2(nums,target);
		System.out.println("is Target found : " + result);
	
	}

}
