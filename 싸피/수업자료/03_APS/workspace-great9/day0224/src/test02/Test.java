package test02;

public class Test {
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addToEnd(13);
		list.addToEnd(88);
		list.addToEnd(39);
		list.addToStart(1);
		list.addToStart(2);
		list.addAfter(13, 44);
		list.addAfter(44, 55);
		list.printList();
	}
}
