package lines;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.drawLine(30, 30, 200, 30);
		g2d.drawLine(200, 30, 30, 200);
		g2d.drawLine(30, 200, 200, 200);
		g2d.drawLine(200, 200, 30, 30);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
