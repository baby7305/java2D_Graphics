package colours;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
class Surface extends JPanel {

	public void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(new Color(125, 167, 116));
		g2d.fillRect(10, 10, 90, 60);

		g2d.setColor(new Color(42, 179, 231));
		g2d.fillRect(130, 10, 90, 60);

		g2d.setColor(new Color(70, 67, 123));
		g2d.fillRect(250, 10, 90, 60);

		g2d.setColor(new Color(130, 100, 84));
		g2d.fillRect(10, 100, 90, 60);

		g2d.setColor(new Color(252, 211, 61));
		g2d.fillRect(130, 100, 90, 60);

		g2d.setColor(new Color(241, 98, 69));
		g2d.fillRect(250, 100, 90, 60);

		g2d.setColor(new Color(217, 146, 54));
		g2d.fillRect(10, 190, 90, 60);

		g2d.setColor(new Color(63, 121, 186));
		g2d.fillRect(130, 190, 90, 60);

		g2d.setColor(new Color(31, 21, 1));
		g2d.fillRect(250, 190, 90, 60);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
