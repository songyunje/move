package test01;

import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1); // add: 가장 뒤에 추가
		list.addLast(2); // addLast: 가장 뒤에 추가
		list.addFirst(3); // addFirst: 가장 앞에 추가
		list.add(2, 4); // 특정 인덱스에 추가
		
		list.remove(1); // 특정 인덱스의 원소 제거
		list.remove(); // 가장 앞에 있는 원소를 제거
		list.removeFirst(); // 가장 앞에 있는 원소를 제거
		list.removeLast(); // 가장 뒤에 있는 원소 제거
		
		list.offer(6); // 가장 뒤에 추가
		list.push(7); // 가장 앞에 추가
		list.pop(); // 가장 앞에 있는 것이 튀어나옴
		list.add(8);
		list.add(9);
		list.poll(); // 가장 앞에 있는 것이 튀어나옴
		
		System.out.println(list.size()); // 현재 리스트에 들어 있는 원소의 개수
		System.out.println(list.isEmpty()); // 리스트가 비어있는지 여부
		System.out.println(list);
	}
}
