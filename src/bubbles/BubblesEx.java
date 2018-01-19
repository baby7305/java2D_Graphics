package bubbles;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class BubblesEx extends JFrame {

	public BubblesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Bubbles");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				BubblesEx ex = new BubblesEx();
				ex.setVisible(true);
			}
		});
	}
}
