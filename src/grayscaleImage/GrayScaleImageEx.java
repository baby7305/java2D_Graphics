package grayscaleImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class GrayScaleImageEx extends JFrame {

	public GrayScaleImageEx() {

		initUI();
	}

	private void initUI() {

		Surface dpnl = new Surface();
		add(dpnl);

		pack();

		setTitle("GrayScale image");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				GrayScaleImageEx ex = new GrayScaleImageEx();
				ex.setVisible(true);
			}
		});
	}
}
