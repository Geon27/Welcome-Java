import java.io.BufferedReader;

//����ó ���Ͽ��� ���� �Էµ� ������ �о ���
public class HandPhone_print {
	public static void main(String[] args) {
		static void view_juso() throws IOExcepton{
			String str = "";
			
			//ó���� fname ������ ������ �� ���� ����
			File f = new File(fname);
			if(!f.exists()) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(fname));
				bw.close();
			}
			
			BufferedReader br = new BufferedReader(new FileReader(fname));
			int i;
			
			// ������ ����ó�� ��� �о ���
			for(i = 1;; i++) // i�� ��� 1�� �����ϴ� ���� ����
			{
				if(!br.ready()) //������ ���� �� ������
					break;
				else {
					str = br.readLine();
					System.out.printf("%2d: %s\n", i, str);
				}
			}
			//i�� 1�̸� ���� ���Ͽ��� ������ ����
			if( i == 0)
				Ststem.out.printf("\n ** ����ó ���Ͽ� ��ȭ��ȣ�� �ϳ��� �����. **\n");
			
			br.close();
		}
	}
}