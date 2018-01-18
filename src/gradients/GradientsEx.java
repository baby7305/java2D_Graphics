package gradients;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class GradientsEx extends JFrame {

	public GradientsEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Gradients");
		setSize(350, 350);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				GradientsEx ex = new GradientsEx();
				ex.setVisible(true);
			}
		});
	}
}
