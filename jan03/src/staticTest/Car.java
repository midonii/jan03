package staticTest;

public class Car {
	private String model;
	private String color;
	private int year;
	private int id;
	static int number = 0;	// 생산차 수
	
	// 생성자
	public Car(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
		this.id = ++number;
	}
	
	public static void main(String[] args) {
		Car car1 = new Car("BMW", "white", 2020);
		Car car2 = new Car("BMW", "white", 2020);
		Car car3 = new Car("BMW", "white", 2020);
		Car car4 = new Car("BMW", "white", 2020);
		Car car5 = new Car("BMW", "white", 2020);
	
		System.out.println(Car.number);
	}
}
