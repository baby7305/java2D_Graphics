package star;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class StarDemoEx extends JFrame {

	public StarDemoEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Star");
		setSize(420, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				StarDemoEx ex = new StarDemoEx();
				ex.setVisible(true);
			}
		});
	}
}
