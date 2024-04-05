package staticex;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(10 * 10 * Calculator.pi);
		
		System.out.println(Calculator.plus(10, 5));
		
		System.out.println(Calculator.minus(10, 5));
		
	}

}
// 계산기 클래스
class Calculator {
	
	static double pi = 3.14159; //pi는 원의 둘레는 구하는 공통 속성
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}