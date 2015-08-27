
/* Q 3.6 (pg81) 
 * Author: Sang Lin
 * Date: 08/26/2015
 */

import java.util.*;
public class SortedStack {

	public static void main(String[] args) {
		Stack s = new Stack<Integer>();
		s.push(5);
		s.push(4);
		s.push(7);
		s.push(0);
		print(sort(s));
	}
	
	public static Stack<Integer> sort(Stack<Integer> s) {
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()) {
			int tmp = s.pop();
			while(!r.isEmpty() && tmp < r.peek()) 
				s.push(r.pop());
			r.push(tmp);
		}
		return r;
	}
	
	public static void print(Stack<Integer> s) {
		while(!s.isEmpty())
			System.out.println(s.pop());
	}
	
}
