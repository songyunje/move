package test01_연결스택;

public class LinkedStack {
	public Node head; // top
	
	public void push(int data) {
		// 새로운 노드 만들기
		Node n = new Node(data);
		// 현재 첫번째 노드는 head를 통해서만 접근 가능..
		// 현재 첫번째 노드는 두번째 노드가 되어야 함..
		// 새로운 노드.next <= 현재 첫번째 노드의 주소값(head)
		n.next = head;
		// head가 새로운 노드 가리키도록 하기
		// head <= 새로운 노드의 주소값
		head = n;
	}
	
	public int pop() {
		if(head != null) { // 리스트가 비어 있지 않다면
			Node toDelete = head; // 첫번째 노드 임시 저장
			head = head.next; // head가 그 다음 노드를 가리키도록 함
			return toDelete.data;
		}
		return -1;
	}

}
