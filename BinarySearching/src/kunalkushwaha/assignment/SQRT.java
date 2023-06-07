package kunalkushwaha.assignment;


public class SQRT {
	
	public static int sqrt(int x) {
		int start = 1;
		int end  = x;
		
		while(start<=end) {
			int mid = start + (end - start)/2;
			 
			if(x/mid == mid) {
				return mid;
			}
			else if(x/mid > mid) {
				start = mid + 1;
			}
			else {
				end =  end - 1;
			}
		}
		return end;
	}
	
	public static void main(String[] args) {
		int ans = sqrt(8);
		System.out.println(ans);
	}
}
