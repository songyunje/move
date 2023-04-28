package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Programmer implements Person {
	// 필드는 필요없고
	
	// 프로그래머의 일상(여러분들이 작성한 코드 수를 반환)
	@Override
	public int coding() throws OuchException{
		System.out.println("열심히 코드를 작성한다."); // 핵심 관심 사항
		if(new Random().nextBoolean())
			throw new OuchException();
		return (int)(Math.random()*100)+1;
	}
}	
