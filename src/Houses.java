import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
public class Houses {
	static Robot r;
	public static void main(String[] args) {
		r = new Robot();
		r.setSpeed(1000);
		Houses h = new Houses();
		Random g = new Random();
		r.setPenColor(g.nextInt(256),g.nextInt(256),g.nextInt(256));
		r.setX(0);
		r.setY(500);
		String sfr = JOptionPane.showInputDialog(null, "How many flat roof houses?");
		String spr = JOptionPane.showInputDialog("Peaked roofs?");
		int fr = Integer.parseInt(sfr);
		int pr = Integer.parseInt(spr);
		for (int i = 0; i < fr;i++) {
			h.drawFlatRoof();
		}
		for (int p = 0; p < pr;p++) {
			h.drawPeakedRoof();
		}

	}
	void drawFlatRoof(){
		r.penDown();
		r.move(400);
		r.turn(90);
		r.move(20);
		r.turn(90);
		r.move(400);
		r.turn(270);
		r.move(10);
		Random f = new Random();
		r.setPenColor(f.nextInt(256),f.nextInt(256),f.nextInt(256));
		r.turn(-90);
	}
	void drawPeakedRoof() {
		r.penDown();
		r.move(400);
		r.turn(45);
		r.move(20);
		r.turn(90);
		r.move(20);
		r.turn(45);
		r.move(400);
		r.turn(270);
		r.setPenColor(0,255,0);
		r.move(10);
		Random f = new Random();
		r.setPenColor(f.nextInt(256),f.nextInt(256),f.nextInt(256));
		r.turn(-90);
	}
}
