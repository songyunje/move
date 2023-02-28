package Test01_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Test01 {
	public static void main(String[] args) {
		// List
		// -순서(index)가 있는 자료구조
		// -중복이 허용된다
		
		//List<String> names = new ArrayList<>();
		List<String> names = new LinkedList<>();
		//List<String> names = new Vector<>();
		
		// 원소 추가
		names.add("안중군");
		names.add("이봉창");
		names.add("이순신");
		names.add(0,"이순신"); //0번 인덱스에다가..	
		
		System.out.println(names);
		
		// 비었는지 체크
		System.out.println(names.isEmpty());
		
		// 원소의 개수
		System.out.println(names.size());
		
		// 수정
		names.set(2, "세종대왕");
		System.out.println(names);
		
		// 조회
		for(String name : names) {
			System.out.println(name);
		}
		
		// 반복자 사용
		Iterator<String> e = names.iterator();
		while(e.hasNext()) {
			System.out.println(e.next());
		}
		
		// 반복자 사용을 좀 더 간편하게 한 것이 For-each
		
		// 인덱스 삭제
		names.remove(2);
		System.out.println(names);
		
		// 값 삭제
		names.remove("이순신");
		System.out.println(names);
		
		// 전부 삭제
		names.clear();
		
		names.add("홍승길");
		names.add("홍승길");
		names.add("정민우");
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		// "홍승길"을 삭제하고 싶다
//		for(int i=0;i<names.size();i++) {
//			if(names.get(i).equals("홍승길")) {
//				names.remove(i);
//			}
//		}
//		
//		System.out.println(names);
		
		// 때로는 뒤에서부터 처리해야됨!
		for(int i=names.size()-1;i>=0;i--) {
			if(names.get(i).equals("홍승길")) {
				names.remove(i);
			}
		}
		System.out.println(names);
		
	}
	
	
}
