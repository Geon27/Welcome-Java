public class HandPhone_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.printf("\n### ģ�� ����ó ���� ### \n");
		
		while(select != "4") {
		print_menu();
		select = sc.next();
		
		switch(select) {
		case "1":
			view_juso();
			break;
		case "2":
			add_juso();
			break;
		case "3":
			delete_juso();
			break;
		case "4":
			return;
			default:
				System.out.printf("\n �߸� �Է��߾��. �ٽ� �����ϼ���. \n");
		}
		}
	}
}