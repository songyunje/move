package com.ssafy.di4;

public class Programmer {
	// 캡슐화
	private Computer computer;
	
	// 객체생성 의존성을 제거하기 위해서 얘가 만드는게 아니라
	// 만들어진 컴퓨터를 넣어주겠다.
	// 데스크톱 or 랩톱이 아닌 컴퓨터로 바꾸며 느슨한 결합을 하겠다.
	
	public Programmer() {
	}
	
	// 생성자 주입
	public Programmer(Computer computer) {
//		computer = new Desktop();
		this.computer = computer;
	}
	

	// setter(설정자) 이용한 주입
	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void coding() {
		System.out.println(computer.getInfo()+"으로 개발을 합니다.");
	}
}
