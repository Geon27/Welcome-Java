class Car{
	private String color;
	private int speed;
	
	//[실습11-2]의 upSpeed(), downSpeed(), getColor(),getSpeed()와 동일
	
	void setColor(String color) {
		this.color = color;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
}

public class Ex11_03 {
	public static void main(String[] args) {
		Car myCar1 = new Car();
		myCar1.setColor("빨강"); // myCar1.color는 오류
		myCar1.setSpeed(0); // myCar1.speed는 오류
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은" + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");
	}
}