//������-�޴� �߰�, �г� ����
Photo() {
	setTitle("���� ó�� ���α׷�");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	contentPane = getContentPane();
	
	//�޴� �߰�
	addMenu();
	
	//�г� �߰�
	DrawImage panel = new DrawImage();
	contentPane.add(pane1, BNorderLayout.CENTER);
	
	//���� â�� �޴��� Ʋ�� ������ ����ؼ� ����
	setSize(8 + 512 + 8, 25 + 31 + 512 + 8);
	setVisible(true);
	
	displayImage();
}

//�г� -> ����� �̹��� ���
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