import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AwesomeFX implements ActionListener{
	static JButton jeopardy = new JButton();
	static JButton keys = new JButton();
	static JButton lava = new JButton();
	static JButton cereal = new JButton();
	public static void main(String[] args) {
		AwesomeFX fxstuff = new AwesomeFX();
		fxstuff.addAct();
	}
	public void addAct() {
		JFrame fx = new JFrame();
		lava.addActionListener(this);
		keys.addActionListener(this);
		jeopardy.addActionListener(this);
		cereal.addActionListener(this);
		JPanel sl = new JPanel();
		lava.setText("Lava");
		cereal.setText("Cereal");
		keys.setText("Keys");
		jeopardy.setText("Jeopardy Think Music!");
		sl.add(lava);
		sl.add(keys);
		sl.add(cereal);
		sl.add(jeopardy);
		fx.add(sl);
		fx.pack();
		fx.setSize(500,500);
		fx.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttpressed = (JButton) e.getSource();
		if (buttpressed.equals(lava)) {
			playSound("lava.wav");
		}
		if (buttpressed.equals(cereal)) {
			playSound("cereal.wav");
		}
		if (buttpressed.equals(keys)) {
			playSound("Keys.wav");
		}
		if (buttpressed.equals(jeopardy)) {
			playSound("jeopardy.wav");
		}
		
	}
	private void playSound(String soundFile) { 
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}