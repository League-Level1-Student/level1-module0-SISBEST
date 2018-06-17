import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class FortuneCookie implements ActionListener{

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();
	}
	public void showButton() {
		     JFrame viewfortune = new JFrame();
		     JButton genfortune = new JButton();
		     viewfortune.add(genfortune);
		     viewfortune.pack();
		     viewfortune.setSize(500,500);
		     viewfortune.setVisible(true);
		     genfortune.setText("I can predict the future! Just click me!");
		     genfortune.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String sage = JOptionPane.showInputDialog("Age?");
		int age = Integer.parseInt(sage);
		age++;
		Random pickfortune = new Random();
		int fortuneselect = pickfortune.nextInt(2);
		if (fortuneselect == 0) {
			JOptionPane.showMessageDialog(null, "You will die at age " + age + " with no family.");
		}
		if (fortuneselect == 1) {
			JOptionPane.showMessageDialog(null, "You will live a long life and die at 108.");
		}
	}

}
