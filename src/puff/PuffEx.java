package puff;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class PuffEx extends JFrame {

	public PuffEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Puff");

		add(new Surface());

		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				PuffEx ex = new PuffEx();
				ex.setVisible(true);
			}
		});
	}
}
