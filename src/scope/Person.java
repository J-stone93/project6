package scope;

public class Person {
		
	
	// Person클래스 내부에서 사용가능 (전역변수)
	// 인스턴스 변수라 객체 생성후 사용 가능
	String personName; 
	int personAge; 
	
	// 클래스 변수라 객체 없이 사용 가능 
	// 클래스 끝나기 전에 사용가능 (전역변수)
	static char gender = 'F'; 
	
	public void setPersonName(String name) { // setPersonName함수 내부에서만 사용가능 (지역변수)
		this.personName = name;
	}
	
}
