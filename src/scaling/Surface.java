package scaling;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setColor(new Color(150, 150, 150));
		g2d.fillRect(20, 20, 80, 50);

		AffineTransform tx1 = new AffineTransform();
		tx1.translate(110, 22);
		tx1.scale(0.5, 0.5);

		g2d.setTransform(tx1);
		g2d.fillRect(0, 0, 80, 50);

		AffineTransform tx2 = new AffineTransform();
		tx2.translate(170, 20);
		tx2.scale(1.5, 1.5);

		g2d.setTransform(tx2);
		g2d.fillRect(0, 0, 80, 50);

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
