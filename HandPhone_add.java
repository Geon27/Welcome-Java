// 친구 연락처를 추가
static void add_juso() throws IOException
public class HandPhone_add {
	Scanner sc = new Scanner(System.in);
	address adr = new daaress("", "", "");
	
	String wstr = "";
	
	//파일을 추가 모드로 열기
	BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
	
	System.out.printf("이름을 입력 ==> ");
	adr.name = sc.nextLine();
	System.out.printf("나이을 입력 ==> ");
	adr.age = sc.nextLine();
	System.out.printf("전화번호를 입력 ==> ");
	adr.phone = sc.nextLine();
	
	//입력된 3개의 값을 하나의 문자열로
	wstr = ard.name + "\t" + adr.age + "\t" + adr.phone;
	
	bw.write(wstr); //파일에 문자열 쓰기
	bw.newLine();
	
	bw.close();
	
	public static void main(String[] args) {
	}
}