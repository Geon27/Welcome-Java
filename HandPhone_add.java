// ģ�� ����ó�� �߰�
static void add_juso() throws IOException
public class HandPhone_add {
	Scanner sc = new Scanner(System.in);
	address adr = new daaress("", "", "");
	
	String wstr = "";
	
	//������ �߰� ���� ����
	BufferedWriter bw = new BufferedWriter(new FileWriter(fname, true));
	
	System.out.printf("�̸��� �Է� ==> ");
	adr.name = sc.nextLine();
	System.out.printf("������ �Է� ==> ");
	adr.age = sc.nextLine();
	System.out.printf("��ȭ��ȣ�� �Է� ==> ");
	adr.phone = sc.nextLine();
	
	//�Էµ� 3���� ���� �ϳ��� ���ڿ���
	wstr = ard.name + "\t" + adr.age + "\t" + adr.phone;
	
	bw.write(wstr); //���Ͽ� ���ڿ� ����
	bw.newLine();
	
	bw.close();
	
	public static void main(String[] args) {
	}
}