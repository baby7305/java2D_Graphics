package spotlight;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class SpotlightEx extends JFrame {

	public SpotlightEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setSize(350, 300);
		setTitle("Spotlight");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				SpotlightEx ex = new SpotlightEx();
				ex.setVisible(true);
			}
		});
	}
}
