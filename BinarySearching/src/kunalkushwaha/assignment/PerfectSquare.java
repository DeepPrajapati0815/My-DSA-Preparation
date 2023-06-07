package kunalkushwaha.assignment;

public class PerfectSquare {
	
	public static boolean isPerfectSquare(int num) {
		if(num == 1) {
			return true;
		}
		
		int start = 0;
		int end = num;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			int factor = num/mid;
			
			if(factor== mid) {
				return true;
			}
			else if(factor > mid) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int num = 16;
		
		System.out.println(isPerfectSquare(num));
	}
}
