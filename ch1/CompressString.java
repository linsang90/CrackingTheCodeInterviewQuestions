package ch1;

/* Q 1.5 (pg73) 
 * Author: Sang Lin
 * Date: 08/24/2015
 */
public class CompressString {

	public static String compress(String s) {
		int i = 0, j, cnt;
		StringBuilder sb = new StringBuilder();
		while(i < s.length()) {
			sb.append(s.charAt(i));
			j = i + 1;
			cnt = 1;
			while(j < s.length() && s.charAt(j) == s.charAt(i)) {
				j++;
				cnt++;
			}
			sb.append(cnt);
			i = j;
		}
		return sb.toString().length() < s.length()? s : sb.toString();
	}
	
	public static void main(String[] args) {
		String s = "aaabbbbccccaa";
		String res = compress(s);
		System.out.println("The orginal string is: " + s);
		System.out.println("The compressed string is: " + res);
	}
}
