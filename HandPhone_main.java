public class HandPhone_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String select = "";
		System.out.printf("\n### 친구 연락처 관리 ### \n");
		
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
				System.out.printf("\n 잘못 입력했어요. 다시 선택하세요. \n");
		}
		}
	}
}