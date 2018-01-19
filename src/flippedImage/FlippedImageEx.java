package flippedImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class FlippedImageEx extends JFrame {

	public FlippedImageEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());
		pack();

		setTitle("Flipped image");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				FlippedImageEx ex = new FlippedImageEx();
				ex.setVisible(true);
			}
		});
	}
}
