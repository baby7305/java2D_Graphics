package transparentRectangles;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		g2d.setPaint(Color.blue);

		for (int i = 1; i <= 10; i++) {

			float alpha = i * 0.1f;
			AlphaComposite alcom = AlphaComposite.getInstance(
					AlphaComposite.SRC_OVER, alpha);
			g2d.setComposite(alcom);
			g2d.fillRect(50 * i, 20, 40, 40);
		}

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
