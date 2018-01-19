package flippedImage;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private Image mshi;
	private BufferedImage bufimg;
	private final int SPACE = 10;

	public Surface() {

		loadImage();
		createFlippedImage();
		setSurfaceSize();
	}

	private void loadImage() {

		mshi = new ImageIcon("resource/bamboo.jpg").getImage();
	}

	private void createFlippedImage() {

		bufimg = new BufferedImage(mshi.getWidth(null),
				mshi.getHeight(null), BufferedImage.TYPE_INT_RGB);

		Graphics gb = bufimg.getGraphics();
		gb.drawImage(mshi, 0, 0, null);
		gb.dispose();

		AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		tx.translate(-mshi.getWidth(null), 0);
		AffineTransformOp op = new AffineTransformOp(tx,
				AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		bufimg = op.filter(bufimg, null);
	}

	private void setSurfaceSize() {

		int w = bufimg.getWidth();
		int h = bufimg.getHeight();

		Dimension d = new Dimension(3*SPACE+2*w, h+2*SPACE);
		setPreferredSize(d);
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.drawImage(mshi, SPACE, SPACE, null);
		g2d.drawImage(bufimg, null, 2*SPACE + bufimg.getWidth(), SPACE);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
