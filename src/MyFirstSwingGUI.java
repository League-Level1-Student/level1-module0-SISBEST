import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		JFrame MyFirstSwingGUI = new JFrame();
		MyFirstSwingGUI.setVisible(true);
		MyFirstSwingGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel MyJPanel = new JPanel();
		JLabel MyJLabel = new JLabel();
		MyJLabel.setText("Hello! Have a great day!");
		MyFirstSwingGUI.add(MyJPanel);
		MyJPanel.add(MyJLabel);
		MyFirstSwingGUI.pack();
		MyJLabel.setIcon(loadImage());
		MyFirstSwingGUI.pack();
	}

	public static ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			return null;
		}
	}
}