
/* Q 5.1(pg91)
 * Author: Sang Lin	
 * Date: 08.29.2015
 */
public class InsertMToN {

	public static int insert(int N, int M, int i, int j) {
		int mask = (-1 >>> (31 - j)); // 31 to j + 1 : 1, j to 0 ：0
		if(i > 0) {
			int mmask = ~(-1 >>> (31 - (i-1))); // 31 to i: 1, i-1 to 0 : 0
			mask = mask & mmask;
		}
		return N & ~mask | (M << i);
	}
	
	public static int insertInBook(int N, int M, int i, int j) {
		int allOnes = ~0;
		int left = allOnes << j + 1;
		int right = (1 << i) - 1;
		int mask = left | right;
		return N & mask | (M << i);
	}
	
	public static void main(String[] args) {
		int N = Integer.parseInt("10000000000", 2);
		int M = Integer.parseInt("10011", 2);
		
		System.out.println(Integer.toBinaryString(insert(N,M,0,4)));
		System.out.println(Integer.toBinaryString(insertInBook(N,M,0,4)));
	}
}
