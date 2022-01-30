void negative() {
	int i, k;
	for(i = 0; i < 512; i++)
		for(k = 0; k < 512; k++)
			outImage[i][k] = 255 - inImage[i][k];
	
	displayImage();
}