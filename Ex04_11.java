public class Ex04_11 {
	public static void main(String[] args) {
		byte a = 'A', b;
		byte mask = 0x0F;
		
		System.out.printf("%X & %X = %X \n", a, mask, a & mask);
		System.out.printf("%X | %X = %X \n", a, mask, a | mask);
		
		mask = 'a' - 'A';
		
		b = (byte)('A' ^ mask);
		System.out.printf("%c ^ %d = %c \n", 'A', mask, b);
		a = (byte)('a' ^ mask);
		System.out.printf("%c ^ %d = %c \n", b, mask, a);
	}
}