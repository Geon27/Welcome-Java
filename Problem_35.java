import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Problem_35 {
	static class MyGUI extends JFrame {
		MyGUI() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setTitle("¿ÃπÃ¡ˆ");
			
			this.setLayout(new GridLayout(3, 3, 10, 10));
			
			String[] imageName =
				{"cat.jpg", "cry.jpg", "flower.jpg", 
				"frog.jpg", "good.jpg" , "no.jpg", 
				"why.jpg", "whyy.jpg", "work.jpg"};
			ImageIcon[] img = new ImageIcon[9];
			JButton[] btn = new JButton[9];
			
			for(int i = 0; i < 9; i++) {
				img[i] = new ImageIcon("image/" + imageName[i]);
				btn[i] = new JButton(img[i]);
				this.add(btn[i]);
			}
			
			setSize(256, 256);
			setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		new MyGUI();
	}
}