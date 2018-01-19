package shearing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ShearingEx extends JFrame {

	public ShearingEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Shearing");
		setSize(330, 270);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				ShearingEx ex = new ShearingEx();
				ex.setVisible(true);
			}
		});
	}
}
