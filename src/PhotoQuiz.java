import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
        quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String image1st = "https://cdn.vox-cdn.com/thumbor/Pkmq1nm3skO0-j693JTMd7RL0Zk=/0x0:2012x1341/1200x800/filters:focal(0x0:2012x1341)/cdn.vox-cdn.com/uploads/chorus_image/image/47070706/google2.0.0.jpg";
        	Component image1;
        	image1 = createImage(image1st);
        	quizWindow.add(image1);
        	quizWindow.pack();
        String guess1 = JOptionPane.showInputDialog("When was this logo launched?");
        if (guess1.equals("September 1, 2015")){
        		System.out.println("Correct!");
        }
        else {
        		System.out.println("NOOOOOOOOO!");
        }
        quizWindow.remove(image1);
        String image2st = "http://openhouse.samuelsharp.com/_/rsrc/1528223765176/app/AppHomeScreenshot.png";
    		Component image2;
    		image2 = createImage(image2st);
    		quizWindow.add(image2);
    		quizWindow.pack();
    		String guess2 = JOptionPane.showInputDialog("What app is this?");
            if (guess2.equals("SOpenHouse")){
            		System.out.println("Correct!");
            }
            else {
            		System.out.println("NOOOOOOOOO!");
            }
	}
	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}
}