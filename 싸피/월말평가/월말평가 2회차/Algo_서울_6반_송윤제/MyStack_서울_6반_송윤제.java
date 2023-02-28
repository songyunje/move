

// stack은 가장 나중에 입력받은 것이 가장 먼저 나가는 방식이다.


public class MyStack_서울_6반_송윤제 {
	public int N = 6;
	public int[] stack = new int[N];
	public int top = -1;

	
	public int pop() {
		top--;
		return stack[top+1];
	}

	public void push(int num) {
		top++;
		stack[top]=num;
	}
	
	public Boolean isEmpty() {
		if(top==-1) 
			return true;
		else
			return false;
	}
	
	public Boolean isFull() {
		if(top==N-1)
			return true;
		else
			return false;
	}
}
