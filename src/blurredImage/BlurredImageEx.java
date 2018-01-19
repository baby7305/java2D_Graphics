package blurredImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class BlurredImageEx extends JFrame {

	public BlurredImageEx() {

		setTitle("Blurred image");
		add(new Surface());

		pack();

		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				BlurredImageEx ex = new BlurredImageEx();
				ex.setVisible(true);
			}
		});
	}
}
