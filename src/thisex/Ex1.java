package thisex;

public class Ex1 {

	public static void main(String[] args) {
		
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		
		System.out.println(bDay);
		
		bDay.printThis(); // this는 year이랑 같은 주소를 갖는다
		

	}

}
class BirthDay {
	
	int year;

	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}