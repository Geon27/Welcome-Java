public class Ex04_16 {
	public static void main(String[] args) {
		int a = 3, result;
		int i;
		
		for (i = 1; i <= 10; i++) {
			result =  a<<i;
			System.out.printf("%d << %d = %d\n", a, i, result);
		}
		
		for (i = 1; i <= 10; i++) {
			result = a>>i; 
			System.out.printf("%d >> %d = %d\n", a, i, result);
		}
	}
}