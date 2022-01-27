public void addMenu() {
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	JMenu photoMenu = new JMenu("���� ó��");
	menuBar.add(photoMenu);
	
	JMenuItem equalAction = new JMenuItem("������ ����");
	JMenuItem negativeAction = new JMenuItem("������ ����");
	JMenuItem mirror1Action = new JMenuItem("�¿� ��Ī ����");
	JMenuItem mirror2Action = new JMenuItem("���� ��Ī ����");
	JMenuItem saveAction = new JMenuItem("����");
	JMenuItem exitAction = new JMenuItem("Exit");
	
	photoMenu.add(equalAction);
	photoMenu.add(negativeAction);
	photoMenu.add(mirror1Action);
	photoMenu.add(mirror2Action);
	photoMenu.addSeparator();
	photoMenu.add(saveAction);
	photoMenu.add(exitAction);
	
	//���� �̹��� ó��
	equalAction.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			equal();
		}
	});
	
	//���� ���� ó��
	negativeAction.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			negative();
		}
	});
	
	//�¿� ��Ī ó��
	mirror1Action.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			mirror1();
		}
	});
	
	//���� ��Ī ó��
	mirror2Action.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			mirror2();
		}
	});
	
	//���� ����
	saveAction.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			saveImage();
		}
	});
	
	exitAction.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
		}
	});
}

void equal() {
}

void negative() {
}

void mirror1() {
}

void mirror2() {
}

public void saveImage() {
}