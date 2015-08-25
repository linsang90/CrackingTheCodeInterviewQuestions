package ch1;

/* Q 1.4 (pg73) 
 * Author: Sang Lin
 * Date: 08/24/2015
 */
public class ReplaceSpace{
	public static void main(String args[]) {
		String s = "Mr John Smith    ";
		int length = 13;
		char[] str = s.toCharArray();
		replace(str, length);
		System.out.println(String.copyValueOf(str));
	}
	
	public static void replace(char[] str, int length) {
		int spaceCount = 0, newLength, i;
		for(i = 0; i < length; i++) 
			if(str[i] == ' ')
				spaceCount++;
		newLength = length + spaceCount * 2;
		for(i = length - 1; i >= 0; i--) {
			if(str[i] == ' ') {
				str[newLength - 1] = '0';
				str[newLength - 2] = '2';
				str[newLength - 3] = '%';
				newLength -= 3;
			} else {
				str[newLength - 1] = str[i];
				newLength --;
			}
		}
	}
}
