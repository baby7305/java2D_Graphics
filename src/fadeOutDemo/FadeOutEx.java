package fadeOutDemo;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class FadeOutEx extends JFrame {

	public FadeOutEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		pack();

		setTitle("Fade out");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				FadeOutEx ex = new FadeOutEx();
				ex.setVisible(true);
			}
		});
	}
}
