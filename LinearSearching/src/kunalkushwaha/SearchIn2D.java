package kunalkushwaha;

import java.util.Arrays;

public class SearchIn2D {
	
	public static int[] searchIn2D(int[][] arr,int target) {
		if(arr.length == 0) {
			return new int[] {-1,-1}; 
		}
	
		for(int row = 0;row<arr.length;row++) {
			for(int col = 0;col<arr[row].length;col++) {
				if(arr[row][col] == target) {
					return new int[] {row,col};
				}
			}
		}
		
		return new int[] {-1,-1};
	}
	
	public static void main(String[] args) {
		int[][] nums = {
				{10,34,53},
				{23,3,6},
				{1,4,7}
		};
		
		int target = 3;
		
		int[] ans = searchIn2D(nums,target);
		
		System.out.println(Arrays.toString(ans));
	}
}
