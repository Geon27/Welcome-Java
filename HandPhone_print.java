import java.io.BufferedReader;

//연락처 파일에서 기존 입력된 내용을 읽어서 출력
public class HandPhone_print {
	public static void main(String[] args) {
		static void view_juso() throws IOExcepton{
			String str = "";
			
			//처음에 fname 파일이 없으면 빈 파일 생성
			File f = new File(fname);
			if(!f.exists()) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
				bw.close();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(fname));
			int i;
			
			// 기존의 연락처를 모두 읽어서 출력
			for(i = 1;; i++) // i는 계속 1씩 증가하는 무한 루프
			{
				if(!br.ready()) //파일을 읽을 수 없으면
					break;
				else {
					str = br.readLine();
					System.out.printf("%2d: %s\n", i, str);
				}
			}
			//i가 1이면 실제 파일에는 내용이 없음
			if( i == 0)
				Ststem.out.printf("\n ** 연락처 파일에 전화번호가 하나도 없어요. **\n");
			
			br.close();
		}
	}
}