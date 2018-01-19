package shearing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		AffineTransform tx1 = new AffineTransform();
		tx1.translate(50, 90);

		g2d.setTransform(tx1);
		g2d.setPaint(Color.green);
		g2d.drawRect(0, 0, 160, 50);

		AffineTransform tx2 = new AffineTransform();
		tx2.translate(50, 90);
		tx2.shear(0, 1);

		g2d.setTransform(tx2);
		g2d.setPaint(Color.blue);

		g2d.draw(new Rectangle(0, 0, 80, 50));

		AffineTransform tx3 = new AffineTransform();
		tx3.translate(130, 10);
		tx3.shear(0, 1);

		g2d.setTransform(tx3);
		g2d.setPaint(Color.red);
		g2d.drawRect(0, 0, 80, 50);

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
