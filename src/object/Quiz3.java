package object;

public class Quiz3 {

	public static void main(String[] args) {

		User user1 = new User("둘리", 10000);
		
		Star1 star1 = new Star1("아메리카노");
		
		user1.showInfo();
		
		
		
		
		
	}

}

class Star1 {

	String menuName;

	int price;

	public Star1(String menuName) {
		super();
		this.menuName = menuName;
	}

	public void buy(int price) {

		this.price = this.price + price;
	}

}

class Star2 {

	String menuName;

	int price;

	public Star2(String menuName) {
		super();
		this.menuName = menuName;
	}

	public void buy(int price) {

		this.price = this.price + price;
	}

}

class User {
	String name;
	int money;

	public User(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}

	// 아메리카노
	public void buyAm(Star1 star1) {
		
		if (this.money >= 4000) {
			star1.buy(4000);
			this.money = this.money - 4000;
		} else {
			System.out.println("아메리카노를 살수 없습니다");
		}
	}

	// 라떼
	public void buyLt(Star2 star2) {

		if (this.money >= 4500) {
			star2.buy(4500);
			this.money = this.money - 4500;
		} else {
			System.out.println("라떼를 살수 없습니다");
		}
	}

	public void showInfo() {

		System.out.println(name + ',' + money);
	}
}
