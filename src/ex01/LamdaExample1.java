package ex01;

import java.util.function.Consumer;

public class LamdaExample1 {

	public static void main(String[] args) {
			// Runnable 인터페이스를 사용한 쓰레드
		/*	Runnable start = () ->
			System.out.println("쓰레드를 시작합니다.");

			start.run(); */
			// 매게 변수를 가진경우
		Consumer<String> greeting = name -> 
		System.out.println(name + "님 환영합니다.");
		
		greeting.accept("태연");
		
		
	}
		
}
