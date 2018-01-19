package unicode;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class UnicodeEx extends JFrame {

	public UnicodeEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Unicode");

		add(new Surface());

		setSize(550, 230);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				UnicodeEx ex = new UnicodeEx();
				ex.setVisible(true);
			}
		});
	}
}
