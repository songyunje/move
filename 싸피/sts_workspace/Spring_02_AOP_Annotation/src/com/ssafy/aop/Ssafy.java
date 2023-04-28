package com.ssafy.aop;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Ssafy implements Person {
	// 필드는 필요없고
	
	// SSAFY인의 일상
	public int coding() throws OuchException{
		System.out.println("열심히 공부를 한다."); // 핵심 관심 사항
		if(new Random().nextBoolean())
			throw new OuchException();
		return (int)(Math.random()*100)+1;
	}
}	
