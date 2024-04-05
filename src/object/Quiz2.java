package object;

public class Quiz2 {

	public static void main(String[] args) {
		
		Student2 student2 = new Student2("둘리", 5000);
		
		Taxi taxi = new Taxi(1002);
		
		student2.takeTaxi(taxi);
		
		student2.showInfo();

	}

}
class Taxi {
	
	int taxiNumber;
	int money;

	public Taxi(int taxiNumber) {
		super();
		this.taxiNumber = taxiNumber;
	}

	public void take(int money) {
		
		this.money = this.money + money;
	}
}
class Student2 {
	
	String studentName;
	int money;
	
	public Student2(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		
		if (this.money >= 10000) {
			
			taxi.take(10000);
			this.money = this.money - 10000;
		} else {
			System.out.println("택시에 탈수 없습니다");
		}
		
	}
	
	public void showInfo() {
		System.out.println(studentName + ',' + money);
	}
	
}





