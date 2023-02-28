

// queue는 처음에 들어온 것이 가장 먼저 나가는 방식이다
// mod를 이용하면 이를 원형큐로 바꿀 수 있고 
// 이렇게 바꾸게 되면 매번 deQueue를 할 때마다 모든 요소들을 앞으로 당겨줄 필요가 없다.


public class MyQueue_서울_6반_송윤제 {
	public int N =6;
	public int[] queue = new int[N];
	public int front=-1;
	public int rear=-1;
	public int temp;
	

	public void enQueue(int num) {
		rear=(rear+1)%N;
		queue[rear]=num;
	}
	
	public int deQueue() {
		front=(front+1)%N;
		temp=queue[front];
		queue[front]=0;
		return temp;
	}
	
	public Boolean isEmpty() {
		if(front==rear && queue[rear] == 0)
			return true;
		else
			return false;
	}
	
	public Boolean isFull() {
		if(front==rear && queue[rear] != 0)
			return true;
		else
			return false;
	}
}

