import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit implements MouseListener {

	JLabel drumLabelWithImage;
	JLabel cymbalLabelWithImage;

	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setTitle("Drum Kit!");
		JPanel panel = new JPanel();
		frame.add(panel);
		String drumImage = "download.jpeg";
		drumLabelWithImage = createLabelImage(drumImage);
		String cymbalImage = "cymbal.jpg";
		cymbalLabelWithImage = createLabelImage(cymbalImage);
		cymbalLabelWithImage.addMouseListener(this);
		panel.add(drumLabelWithImage);
		panel.add(cymbalLabelWithImage);
		panel.setLayout(new GridLayout());
		frame.setSize(500, 500);
		frame.pack();
		drumLabelWithImage.addMouseListener(this);

	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("DEBUG MESSAGE: INSTRUMENT CLICKED");

		JLabel drumClicked = (JLabel) e.getSource(); // This line gets the label that the mouse clicked on
		if (drumClicked.equals(drumLabelWithImage)) {
			playSound("drumsmall.wav");
		}
		if (drumClicked.equals(cymbalLabelWithImage)) {
			playSound("cymbal.wav");
		}
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}