class Car{
	private String color;
	private int speed;
	
	//[�ǽ�11-2]�� upSpeed(), downSpeed(), getColor(),getSpeed()�� ����
	
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
		myCar1.setColor("����"); // myCar1.color�� ����
		myCar1.setSpeed(0); // myCar1.speed�� ����
		
		myCar1.upSpeed(30);
		System.out.println("�ڵ���1�� ������" + myCar1.getColor() + "�̸�, ����ӵ��� " + myCar1.getSpeed() + "km �Դϴ�.");
	}
}