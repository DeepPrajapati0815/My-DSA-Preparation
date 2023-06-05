package kunalkushwaha;

/*
- smallest letter in array that is greater than target.
 
- once (start<=end) condition is break or violated the start will be mid + 1 
  which is always greater than target and smaller element 
  
- if the target is greater than greatest letter than we just return the first letter by 
  start % length because at that point of time start becomes length of array.
	
- so the final answer will be [start % length]

*/


public class SmallestLatter {
	
	public static char smallestLatter(char[] letters,int target) {
			
			
			int start = 0;
			int end = letters.length - 1;
			
			
			
			while(start<=end) {
				int mid = start + (end - start)/2;
				
				if(target < letters[mid]){
					end = mid - 1;
				}
				else{
					start = mid + 1;
				}
			}
			
			return letters[start % letters.length];
	}
		

	public static void main(String[] args) {
		char[] letters = {'d','e','e','p'};
		
		char ans = smallestLatter(letters,'p');
		
		System.out.println(ans);
	}

}
