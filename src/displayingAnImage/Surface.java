package displayingAnImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private Image mshi;

	public Surface() {

		loadImage();
		setSurfaceSize();
	}

	private void loadImage() {

		mshi = new ImageIcon("resource/bamboo.jpg").getImage();
	}

	private void setSurfaceSize() {

		Dimension d = new Dimension();
		d.width = mshi.getWidth(null);
		d.height = mshi.getHeight(null);
		setPreferredSize(d);
	}

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(mshi, 0, 0, null);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}
