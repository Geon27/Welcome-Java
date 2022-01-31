public void saveImage() {
	int i, k;
	
	String newFname = "c:\\temp\\result.raw";
	File outFp; // 파일 핸들
	FileOutputStream outFs; // 파일 스트림 핸들
	
	outFp = new File(newFname);
	
	// 저장한 파일 스트림
	try {
		outFs = new FileOutputStream(outFp.getpath());
		
		//메모리 --> 파일
		for(i = 0; i < 512; i++) {
			for(k = 0; k < 512; k++) {
				outFs.write(outImage[i][k]);
			}
		}
		outFs.close();
		JOptionPane.showMessageDialog(null, "파일 저장 성공", "파일 저장", JOptionPane.INFORMATION_MESSAGE);	
	
	} catch(Exception e) {
		// TOD0 Auto-generated catch block
		e.printStackTrace();
	}
	
}