
/*
* Q 9.2(pg 109)
* Name: Sang Lin
* Date: 09.02.2015
*/
public class MagicIndex {

	public static int magicFast(int[] a,int start,int end) {
		if(start > end || start < 0 || end >= a.length) return -1;
		int mid = (start + end) / 2;
		int midValue = a[mid];
		if(mid == midValue) return mid;
		
		int leftIndex = Math.min(mid - 1, midValue);
		int left = magicFast(a, start, leftIndex);
		if(left > 0) return left;
		
		int rightIndex = Math.max(mid + 1, midValue);
		int right = magicFast(a, rightIndex, end);
		return right;
	}
	
	public static int magicFast(int[] a) {
		return magicFast(a, 0, a.length - 1);
	}
}
