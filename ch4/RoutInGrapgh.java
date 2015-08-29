
/* Q 4.2 (pg86) 
 * Author: Sang Lin
 * Date: 08/28/2015
 */

import java.util.*;

public class RoutInGrapgh {

	public static class Node {
		int value;
		State state;
	}
	
	public enum State{
		Visited, Visiting, Unvisited;
	}
	
	public static boolean search(Graph g, Node start, Node end) {
		LinkedList<Node> q =  new LinkedList<Node>();
		for(Node u : g.getNodes()) {
			u.state = State.Unvisited;
		}
		
		start.state = State.Visiting;
		q.add(start);
		while(!q.isEmpty()) {
			Node u = q.removeFirst();
			for(Node v : u.getAdjacent()) {
				if(u.state == State.Unvisited) {
					if(v == end) return true;
					else {
						q.add(v);
						v.state = State.Visiting;
					}
				}
			}
			u.state = State.Visited;
		}
		return false;
	}
}
