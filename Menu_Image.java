public void addMenu() {
	JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
	JMenu photoMenu = new JMenu("사진 처리");
	menuBar.add(photoMenu);
	
	JMenuItem equalAction = new JMenuItem("동일한 사진");
	JMenuItem negativeAction = new JMenuItem("반전된 사진");
	JMenuItem mirror1Action = new JMenuItem("좌우 대칭 사진");
	JMenuItem mirror2Action = new JMenuItem("상하 대칭 사진");
	JMenuItem saveAction = new JMenuItem("저장");
	JMenuItem exitAction = new JMenuItem("Exit");
	
	photoMenu.add(equalAction);
	photoMenu.add(negativeAction);
	photoMenu.add(mirror1Action);
	photoMenu.add(mirror2Action);
	photoMenu.addSeparator();
	photoMenu.add(saveAction);
	photoMenu.add(exitAction);
	
	//동일 이미지 처리
	equalAction.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			equal();
		}
	});
	
	//반전 영상 처리
	negativeAction.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			negative();
		}
	});
	
	//좌우 대칭 처리
	mirror1Action.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			mirror1();
		}
	});
	
	//상하 대칭 처리
	mirror2Action.addActionListener(new ActionListener){
		public void actionPerformed(ActionEvent arg0) {
			mirror2();
		}
	});
	
	//파일 저장
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