//생성자-메뉴 추가, 패널 부착
Photo() {
	setTitle("사진 처리 프로그램");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane = getContentPane();
	
	//메뉴 추가
	addMenu();
	
	//패널 추가
	DrawImage panel = new DrawImage();
	contentPane.add(pane1, BNorderLayout.CENTER);
	
	//윈도 창의 메뉴나 틀의 폭까지 고려해서 조절
	setSize(8 + 512 + 8, 25 + 31 + 512 + 8);
	setVisible(true);
	
	displayImage();
}

//패널 -> 입출력 이미지 출력
class DrawImage extends JPanel {
	public void paintCompinent(Graphics g) {
		super.paintComponent(g);
		int R, G, B;
		int i, k;
		for(i = 0; i < 512; i++) {
			for(k = 0; k < 512; k++) {
				R = G = B = (int) outImage[i][k];
				g.setColor(new Color(R, G, B));
				g.drawRect(k, i, 1, 1);
			}
		}
	}
}

void displayImage() {
	Graphics g = contentPane.getGraphics();
	contentPane.paintAll(g);
}

public void addMenu() {
	
}