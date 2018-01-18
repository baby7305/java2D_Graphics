package textures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2018/1/18.
 */
class Surface extends JPanel {

	private BufferedImage slate;
	private BufferedImage java;
	private BufferedImage pane;
	private TexturePaint slatetp;
	private TexturePaint javatp;
	private TexturePaint panetp;

	public Surface() {

		loadImages();
	}

	private void loadImages() {

		try {

			slate = ImageIO.read(new File("src/textures/bamboo.jpg"));
			java = ImageIO.read(new File("src/textures/doors.jpg"));
			pane = ImageIO.read(new File("src/textures/floors.jpg"));

		} catch (IOException ex) {

			Logger.getLogger(Surface.class.getName()).log(
					Level.SEVERE, null, ex);
		}
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g.create();

		slatetp = new TexturePaint(slate, new Rectangle(0, 0, 90, 60));
		javatp = new TexturePaint(java, new Rectangle(0, 0, 90, 60));
		panetp = new TexturePaint(pane, new Rectangle(0, 0, 90, 60));

		g2d.setPaint(slatetp);
		g2d.fillRect(10, 15, 90, 60);

		g2d.setPaint(javatp);
		g2d.fillRect(130, 15, 90, 60);

		g2d.setPaint(panetp);
		g2d.fillRect(250, 15, 90, 60);

		g2d.dispose();
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
