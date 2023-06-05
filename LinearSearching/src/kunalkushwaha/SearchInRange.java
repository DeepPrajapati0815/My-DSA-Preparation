package kunalkushwaha;

public class SearchInRange {
	
	public static int searchInRange(int[] arr,int start,int end,int target) {
		if(arr.length == 0) {
			return -1;
		}
		
		for(int i = start;i<end;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {

		int[] nums = new int[] {19,43,23,5,1,45,3};
		int target = 23;
		
		int ans = searchInRange(nums,1,4,target);
		System.out.println("search in range: " + ans);
	
	}
}
