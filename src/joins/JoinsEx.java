package joins;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class JoinsEx extends JFrame {

	public JoinsEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Joins");
		setSize(340, 110);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				JoinsEx ex = new JoinsEx();
				ex.setVisible(true);
			}
		});
	}
}
