
/*Q.10.4
 * Author: Sang Lin
 * Date: 10.22.2015
 */
public class CheckDuplicates {
	public static void checkDuplicates(int[] array) {
		int len = array.length;
		BitSet bs = new BitSet(32000);
		for(int n : array) {
			if(bs.get(n)) System.out.println(n);
			else bs.set(n);
		}
	}
}

class BitSet {
	int[] bitset;
	
	BitSet(int size) {
		bitset = new int[size >> 5 + 1];
	}
	
	public boolean get(int n) {
		int wordNumber = n / 32;
		int bitNumber = n % 32;
		return (bitset[wordNumber] & (1 << bitNumber)) == 1;
	}
	
	public void set(int n) {
		int wordNumber = n / 32;
		int bitNumber = n % 32;
		bitset[wordNumber] |= (1 << bitNumber);
	}
}