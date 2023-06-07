package kunalkushwaha.assignment;

/*
 * Initialize the start pointer start to 1 and the end pointer end to n.
 * While start is less than or equal to end:
	- Calculate the midpoint mid as start + (end - start) / 2.
	- Calculate the number of coins needed for mid rows as coinsNeeded = mid * (mid + 1) / 2.
 * If coinsNeeded is equal to n, return mid.
 * If coinsNeeded is less than n, update start to mid + 1.
 * If coinsNeeded is greater than n, update end to mid - 1.
 * Return the value of end.

*/

public class ArrangingCoins {
	
	public static int calculateCoinsArrangment(int num) {
		long start = 1;
		long end = num;
		
		while(start <= end) {
			long mid = start + (end - start)/2;
			
			long coinsNeeded = mid * (mid + 1)/2;
			
			if(coinsNeeded == num) {
				return (int)mid;
			}
			else if(coinsNeeded < num) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
		}
		return (int)end;
	}
	
	public static void main(String[] args) {
		int num = 10;
		
		int ans = calculateCoinsArrangment(num);
		System.out.println(ans);
	}
}
