/* Q 3.1 (pg80) 
 * Author: Sang Lin
 * Date: 08/26/2015
 */
public class FixedArrayStack {

	int stackSize = 100;
	int[] buffer = new int[stackSize * 3];
	int[] stackPointer = {-1, -1, -1};
	
	public void push(int stackNumber, int value) throws Exception  {
		if(stackPointer[stackNumber] + 1 > stackSize) throw new FullStackException("The stack is full.");
		else {
			stackPointer[stackNumber]++;
			buffer[absTopStack(stackNumber)] = value;
		}
	}
	
	public int pop(int stackNumber) throws Exception{
		if(isEmpty(stackNumber)) throw new EmptyStackException("The stack is empty.");
		else {
			int value = buffer[absTopStack(stackNumber)];
			buffer[absTopStack(stackNumber)] = 0;
			stackPointer[stackNumber]--;
			return value;
		}
	}
	
	public int peek(int stackNumber) throws Exception{
			if(isEmpty(stackNumber)) throw new EmptyStackException("The stack is empty.");
			int value = buffer[absTopStack(stackNumber)];
			return value;
	}
	
	public boolean isEmpty(int stackNumber) {
		if(stackPointer[stackNumber] == -1) return true;
		return false;
	}
	
	private int absTopStack(int stackNumber) {
		return stackNumber * stackSize + stackPointer[stackNumber];
	}
	
	public class FullStackException extends Exception {
		 public FullStackException(String message) {
		        super(message);
		 }
	}
	public class EmptyStackException extends Exception {
		 public EmptyStackException(String message) {
		        super(message);
		    }
	}
}
