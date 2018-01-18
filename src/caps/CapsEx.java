package caps;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class CapsEx extends JFrame {

	public CapsEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Caps");
		setSize(280, 270);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				CapsEx ex = new CapsEx();
				ex.setVisible(true);
			}
		});
	}
}
