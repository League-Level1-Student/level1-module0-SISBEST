import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	static JButton Ducks = new JButton();
	static JButton Frogs = new JButton();
	static JButton FluffyUnicorns = new JButton();
	public static void main(String[] args) {
		CutenessTV tv = new CutenessTV();
		tv.addact();
		Ducks.setText("Ducks");
		Frogs.setText("Frogs");
		FluffyUnicorns.setText("Fluffy Unicorns!!!!!!!");
		JPanel p = new JPanel();
		p.add(Ducks);
		p.add(Frogs);
		p.add(FluffyUnicorns);
		JFrame f = new JFrame();
		f.add(p);
		f.pack();
		f.setVisible(true);
		
}

	void addact() {
		Ducks.addActionListener(this);
		Frogs.addActionListener(this);
		FluffyUnicorns.addActionListener(this);
		
	}
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonpressed = (JButton) e.getSource();
		if (buttonpressed.equals(Ducks)) {
			showDucks();
		}
		else if (buttonpressed.equals(Frogs)) {
			showFrog();
		}
		else if (buttonpressed.equals(FluffyUnicorns)) {
			showFluffyUnicorns();
		}
		
	}
}
