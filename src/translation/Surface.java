package translation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setPaint(new Color(150, 150, 150));
		g2d.fillRect(20, 20, 80, 50);
		g2d.translate(150, 50);
		g2d.fillRect(20, 20, 80, 50);

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
