import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {
	String firstImage = "src/arnold.jpeg";
	String secondImage = "src/leonardo.jpeg";
	String thirdImage = "src/morgan.jpeg";
	String fourthImage = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {
		int score = 0;
		for (int i = 1; i < 5; i++) {
			String guess= JOptionPane.showInputDialog("who is this?");
			if (i == 1 && guess.equals("Arnold")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
			else if (i == 2 && guess.equals("Leonardo")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
			else if (i == 3 && guess.equals("Morgan")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
			else if (i == 4 && guess.equals("Jack")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			}
			else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
			}
			System.out.println("Your score is " + score + "!");
			showNextImage();
		}

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);		
		window.setSize(200,200);
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(fourthImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}