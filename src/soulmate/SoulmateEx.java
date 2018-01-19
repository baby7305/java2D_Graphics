package soulmate;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class SoulmateEx extends JFrame {

	public SoulmateEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Soulmate");

		add(new Surface());

		setSize(420, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				SoulmateEx ex = new SoulmateEx();
				ex.setVisible(true);
			}
		});
	}
}
