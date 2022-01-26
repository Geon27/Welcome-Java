public class Photo extends JFrame {
	static int[][] inImage = new int[512][512];
	static int[][] outImage = new int[512][512];
	
	Container contentPane;
	
	public static void main(String[] args) throws Exception{
		
		loadImage();
		new Photo(); 
	}
	
	static public void loadImage() throws Exception {
		int i, k;
		
		File inFp; // 파일 핸들
		FileInputStream inFs; // 파일 스트림 핸들
		inFp = new File("c:\\temp\\prince.raw");
		
		//읽어올 파일 스트림
		inFp = new FileInputStream(inFp.getPath());
		
		//파일 -> 메모리
		for(i = 0; i < 512; i++) {
			for(k = 0; k < 512; k++) {
				inImage[i][k] = inFs.read();
				outImage[i][k] = inImage[i][k];
			}
		}
		inFs.close();
	}
	
	Photo(){
	}
}