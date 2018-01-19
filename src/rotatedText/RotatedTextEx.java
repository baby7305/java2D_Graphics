package rotatedText;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class RotatedTextEx extends JFrame {

	public RotatedTextEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Rotated text");
		setSize(450, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				RotatedTextEx ex = new RotatedTextEx();
				ex.setVisible(true);
			}
		});
	}
}
