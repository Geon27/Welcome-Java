import java.util.Scanner;
public class Ex02_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		int result;
		
		Scanner s = new Scanner(System.in);
		System.out.print("ù��° ����� ���� �Է��ϼ��� ==>");
		a = s.nextInt();
		System.out.print("�ι�° ����� ���� �Է��ϼ��� ==>");
		b = s.nextInt();
		System.out.print("����° ����� ���� �Է��ϼ��� ==>");
		c = s.nextInt();
		
		result = a + b + c;
		System.out.println(a + "+" + b + "+" + c + "=" + result);
		
		result = a * b * c;
		System.out.println(a + "*" + b + "*" + c + "=" + result);
	}

}