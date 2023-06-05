package kunalkushwaha;

public class SearchInString {
	
	public static int searchCharInString(String str,char target) {
		if(str.length() == 0) {
			return -1;
		}
		
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)== target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String text = "Deep Prajapati";
		
		int ans = searchCharInString(text, 'r');
		System.out.println("char found at index : " + ans);
			
	}
}
