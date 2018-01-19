package clipping;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ClippingEx extends JFrame {

	public ClippingEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Clipping");

		add(new Surface());

		pack();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ClippingEx cl = new ClippingEx();
				cl.setVisible(true);
			}
		});
	}
}
