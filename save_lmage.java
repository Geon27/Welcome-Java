public void saveImage() {
	int i, k;
	
	String newFname = "c:\\temp\\result.raw";
	File outFp; // ���� �ڵ�
	FileOutputStream outFs; // ���� ��Ʈ�� �ڵ�
	
	outFp = new File(newFname);
	
	// ������ ���� ��Ʈ��
	try {
		outFs = new FileOutputStream(outFp.getpath());
		
		//�޸� --> ����
		for(i = 0; i < 512; i++) {
			for(k = 0; k < 512; k++) {
				outFs.write(outImage[i][k]);
			}
		}
		outFs.close();
		JOptionPane.showMessageDialog(null, "���� ���� ����", "���� ����", JOptionPane.INFORMATION_MESSAGE);	
	
	} catch(Exception e) {
		// TOD0 Auto-generated catch block
		e.printStackTrace();
	}
	
}