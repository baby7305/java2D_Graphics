package operations;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private final int rules[] = {
			AlphaComposite.DST,
			AlphaComposite.DST_ATOP,
			AlphaComposite.DST_OUT,
			AlphaComposite.SRC,
			AlphaComposite.SRC_ATOP,
			AlphaComposite.SRC_OUT
	};

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		for (int x = 20, y = 20, i = 0; i < rules.length; x += 60, i++) {

			AlphaComposite ac = AlphaComposite.getInstance(rules[i], 0.8f);

			BufferedImage buffImg = new BufferedImage(60, 60,
					BufferedImage.TYPE_INT_ARGB);
			Graphics2D gbi = buffImg.createGraphics();

			gbi.setPaint(Color.blue);
			gbi.fillRect(0, 0, 40, 40);
			gbi.setComposite(ac);

			gbi.setPaint(Color.green);
			gbi.fillRect(5, 5, 40, 40);

			g2d.drawImage(buffImg, x, y, null);
			gbi.dispose();
		}

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
