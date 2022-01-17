package pack1;

public class Truck extends pack2.Car {
	Truck() {
		System.out.println("패키지 1의 Truck 생성자");
	}
	
	public static void main(String[] args) {
		Truck truck1 = new Truck();
		System.out.println(Car.CAR_NAME);
		System.out.println(pack2.Car.CAR_NAME);
	}
}