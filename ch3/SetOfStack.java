/* Q 3.3 (pg81) 
 * Author: Sang Lin
 * Date: 08/26/2015
 */

import java.util.*;
public class SetOfStack {
	ArrayList<Stack> set;
	int capacity;
	
	SetOfStack(int c){
		set = new ArrayList<Stack>();
		capacity = c;
	}
	
	public void push(Object o){
		Stack last = getLastStack();
		if(last != null && isFull(last)) set.add(new Stack<Object>());
		last = getLastStack();
		last.add(o);
	}
	
	public Object pop() {
		Stack last = getLastStack();
		if(last.isEmpty()) set.remove(set.size() - 1);
		last = getLastStack();
		return last.pop();
	}
	
	public Object popAt(int index) {
		if(index < set.size() && set.get(index).isEmpty()) {
			set.remove(index);
			return set.get(index).pop();
		} else return null;
	}
	
	private Stack getLastStack() {
		if(set.size() == 0) return null;
		return set.get(set.size() - 1);
	}
	
	private boolean isFull(Stack stack){
		return stack.size() == capacity;
	}
}
