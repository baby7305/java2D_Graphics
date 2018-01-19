package grayscaleImage;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private Image mshi;
	private BufferedImage bufimg;
	private Dimension d;

	public Surface() {

		loadImage();
		determineAndSetSize();
		createGrayImage();
	}

	private void determineAndSetSize() {

		d = new Dimension();
		d.width = mshi.getWidth(null);
		d.height = mshi.getHeight(null);
		setPreferredSize(d);
	}

	private void createGrayImage() {

		bufimg = new BufferedImage(d.width, d.height,
				BufferedImage.TYPE_BYTE_GRAY);

		Graphics2D g2d = bufimg.createGraphics();
		g2d.drawImage(mshi, 0, 0, null);
		g2d.dispose();
	}

	private void loadImage() {

		mshi = new ImageIcon("resource/bamboo.jpg").getImage();
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bufimg, null, 0, 0);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
