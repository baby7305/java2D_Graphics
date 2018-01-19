package blurredImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private BufferedImage mshi;
	private BufferedImage bluri;

	public Surface() {

		loadImage();
		createBlurredImage();
		setSurfaceSize();
	}

	private void loadImage() {

		try {

			mshi = ImageIO.read(new File("resource/bamboo.jpg"));
		} catch (IOException ex) {

			Logger.getLogger(Surface.class.getName()).log(
					Level.WARNING, null, ex);
		}
	}

	private void createBlurredImage() {

		float[] blurKernel = {
				1 / 9f, 1 / 9f, 1 / 9f,
				1 / 9f, 1 / 9f, 1 / 9f,
				1 / 9f, 1 / 9f, 1 / 9f
		};

		BufferedImageOp blur = new ConvolveOp(new Kernel(3, 3, blurKernel));
		bluri = blur.filter(mshi, new BufferedImage(mshi.getWidth(),
				mshi.getHeight(), mshi.getType()));
	}

	private void setSurfaceSize() {

		Dimension d = new Dimension();
		d.width = mshi.getWidth(null);
		d.height = mshi.getHeight(null);
		setPreferredSize(d);
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bluri, null, 0, 0);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
