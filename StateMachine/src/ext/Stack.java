package ext;

public class Stack {
	
	private java.util.Stack<String> stack = new java.util.Stack<>();
	
	public boolean onlyOne() {
		return stack.size() == 1;
	}
	
	public boolean moreThanOne() {
		return stack.size() > 1;
	}
	
	public void pushAction(String value) {
		stack.push(value);
	}
	
	public String popAction() {
		return stack.pop();
	}
	
	public String toString() {
		return stack.toString();
	}
	
}
