package pack1;

import pack2.Car;

public class Truck2 extends Car {
	Truck() {
		System.out.println("��Ű�� 1�� Truck ������");
	}

public static void main(String[] args) {
	Truck truck1 = new Truck();
	System.out.println(Car.CAR_NAME);
	System.out.println(pack2.Car.CAR_NAME);
	}
}