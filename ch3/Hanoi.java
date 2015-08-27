
/* Q 3.4 (pg81) 
 * Author: Sang Lin
 * Date: 08/26/2015
 */

import java.util.*;
public class Hanoi {

	public static void main(String[] agrs) {
		int n = 3;
		Tower[] tower = new Tower[n];
		for(int i = 0; i < n; i++) 
			tower[i] = new Tower(i);
		for(int i = n - 1; i >= 0;  i--) {
			tower[0].add(i);
		}
		tower[0].moveDisks(n, tower[2], tower[1]);
	}
	
	public static class Tower {
		private Stack<Integer> disks;
		private int index;
		
		public Tower(int i) {
			disks = new Stack<Integer>();
			index = i;
		}
		
		public int index() {
			return index;
		}
		public void add(int disk) {
			if(!disks.isEmpty() && disk >= disks.peek()) {
				System.out.println("Error placing disk " + disk);
			} else {
				disks.push(disk);
			}
		}
		
		public void moveTopTo(Tower destination) {
			int top = disks.pop();
			destination.add(top);
			System.out.println("Move " + top + " from " + index() + " to " + destination.index());
		}
		
		public void moveDisks(int n, Tower destination, Tower buffer) {
			if(n == 0) return;
			moveDisks(n-1, buffer, destination);
			moveTopTo(destination);
			buffer.moveDisks(n-1, destination, this);
		}
	}
}
