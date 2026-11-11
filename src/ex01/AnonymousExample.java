package ex01;


class WelcomeAction implements LabAction
{
	
	@Override
	public void run() {
		System.out.println("환영합니다.");
	}
	
}

	// 실제 실행앱
public class AnonymousExample {
	public static void main (String[]args) {
		LabAction action = new WelcomeAction();
		action.run();
	}
}