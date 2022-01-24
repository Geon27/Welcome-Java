import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class HandPhone_delete {
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		//연락처 파일의 내용 전체를 저장하기 위한 문자열 배열
		String[] read_str = new String[50]; // 최대 연락처 개수 선택(50)
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// 연락처 파일이 없으면 돌아간다.
		if(!br.ready()) {
			System.out.printf("\n!! 연락처 파일이 없습니다. !!\n");
			return;
		}
		
		System.out.printf("\n삭제할 행 번호는?");
		del_line = sc.nextInt();
		
		for(i = 0; i < 50; i++)
		{
			if((str = br.readLine()) == null)
				break;
			
			if(i + 1 != del_line)
			{
				read_str[count] = str;
				count++;
			}else
				System.out.printf("%d 행이 삭젲 되었습니다. \n", del_line);
		}
		
		br.close();
		
		//파일을 쓰기 모드로 열고 새로운 내용을 쓴다.
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		
		for(i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}
		
		bw.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
