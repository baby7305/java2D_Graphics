package soulmate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		RenderingHints rh =
				new RenderingHints(RenderingHints.KEY_ANTIALIASING,
						RenderingHints.VALUE_ANTIALIAS_ON);

		rh.put(RenderingHints.KEY_RENDERING,
				RenderingHints.VALUE_RENDER_QUALITY);

		g2d.setRenderingHints(rh);

		g2d.setFont(new Font("叶根友毛笔行书2.0版 常规", Font.PLAIN, 13));

		g2d.drawString("Most relationships seem so transitory", 20, 30);
		g2d.drawString("They're all good but not the permanent one", 20, 60);
		g2d.drawString("Who doesn't long for someone to hold", 20, 90);
		g2d.drawString("Who knows how to love you without being told", 20, 120);
		g2d.drawString("Somebody tell me why I'm on my own", 20, 150);
		g2d.drawString("If there's a soulmate for everyone", 20, 180);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
