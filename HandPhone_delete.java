import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;

public class HandPhone_delete {
	static void delete_juso() throws IOException {
		Scanner sc = new Scanner(System.in);
		//����ó ������ ���� ��ü�� �����ϱ� ���� ���ڿ� �迭
		String[] read_str = new String[50]; // �ִ� ����ó ���� ����(50)
		String str = "";
		int del_line, i, count = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(fname));
		
		// ����ó ������ ������ ���ư���.
		if(!br.ready()) {
			System.out.printf("\n!! ����ó ������ �����ϴ�. !!\n");
			return;
		}
		
		System.out.printf("\n������ �� ��ȣ��?");
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
				System.out.printf("%d ���� �蠦 �Ǿ����ϴ�. \n", del_line);
		}
		
		br.close();
		
		//������ ���� ���� ���� ���ο� ������ ����.
		BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
		
		for(i = 0; i < count; i++) {
			bw.write(read_str[i]);
			bw.newLine();
		}
		
		bw.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
