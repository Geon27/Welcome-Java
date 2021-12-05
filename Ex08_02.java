import java.util.Scanner;

public class Ex08_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] aa = new int[4];
		int hap;
		
		System.out.printf("1번쨰 숫자를 입력하세요 : ");
		aa[0] = s.nextInt();
		System.out.printf("2번쨰 숫자를 입력하세요 : ");
		aa[1] = s.nextInt();
		System.out.printf("3번쨰 숫자를 입력하세요 : ");
		aa[2] = s.nextInt();
		System.out.printf("4번쨰 숫자를 입력하세요 : ");
		aa[3] = s.nextInt();
		
		hap = aa[0] + aa[1] + aa[2] + aa[3];
		
		System.out.printf("합계 ==> %d \n", hap);
	}
}