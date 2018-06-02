import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DuelingButtons implements ActionListener {

	public static void main(String[] args) {
		new DuelingButtons().createUI();
	}

	JButton leftButton = new JButton();
	JButton rightButton = new JButton();

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	private void createUI() {
		panel.add(leftButton);
		panel.add(rightButton);
		frame.add(panel);
		frame.setSize(500, 500);
		frame.setVisible(true);
		leftButton.setText("Click Me!");
		rightButton.setText("Click Me!");
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		frame.setTitle("Demanding Buttons (Don't let them argue too much!)");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();

		if (buttonPressed.equals(leftButton)) {
			rightButton.setText("No!!!!!! CLICK ME!!!!!!!!!!!!!!");
			leftButton.setText("Thanks! DON'T CLICK RIGHT!");
			rightButton.setPreferredSize(BIG);
			leftButton.setPreferredSize(SMALL);
		} else if (buttonPressed.equals(rightButton)) {
			leftButton.setText("No!!!!!! CLICK ME!!!!!!!!!!!!!!");
			rightButton.setText("Thanks! DON'T CLICK LEFT!");
			leftButton.setPreferredSize(BIG);
			rightButton.setPreferredSize(SMALL);
		}

		frame.pack();
	}
}
