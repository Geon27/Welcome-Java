public class Ex03_13 {
	public static void main(String[] args) {
		int a, b;
		char c, d;
		
		a = 0xF90A;
		b = 0x50;
		
		System.out.printf("%c \t", a);
		
		c  = (char) b;
		System.out.printf("%c \n", (int) c);
		
		d = '#';
		System.out.printf("%c의 ASCII값은 %d 입니다 \n", d, (int) d);
	}
}