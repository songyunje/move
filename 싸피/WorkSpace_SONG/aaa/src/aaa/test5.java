package aaa;

import java.util.LinkedList;
import java.util.Queue;

public class test5 {
	public class Person{
		int num;
		int cnt;
		
		public Person(int num, int cnt) {
			this.num = num;
			this.cnt = cnt;
		}
	}
	
	public static void main(String[] args) {
		int N = 20;
		int pNum = 1;
		
		Queue<Person> q = new LinkedList<Person>();
		
		q.offer(new Person(pNum, 1));
		
		while(N>0) {
			Person p = q.poll();
			N -= p.cnt;
			
			if(N <= 0) {
				
			}else {
				p.cnt++;
				q.offer(p);
				q.offer(new Person(++pNum,1));
			}
		}
	}

}
