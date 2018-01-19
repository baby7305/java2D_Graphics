package rotation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class RotationEx extends JFrame {

	public RotationEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Rotation");

		add(new Surface());

		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				RotationEx ex = new RotationEx();
				ex.setVisible(true);
			}
		});
	}
}
