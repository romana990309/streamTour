package ex01;




	// 실제 실행앱
public class AnonymousExample {
	public static void main (String[]args) {
		// 1. 이름이 있는 클래스로 기능만들기
		//LabAction action = new WelcomeAction();
		//action.run();
		// 2. 익명클래스를 이용한 기능 구현
		/*LabAction action = new LabAction (){
			
			@Override
			public void run() {
				System.out.println("환영합니다.");
			}
			
		};
		action.run(); */
		// 3. 람다식을 이용한 기능 구현
		LabAction action = () -> System.out.println("환영합니다.");
		action.run();
	}
}