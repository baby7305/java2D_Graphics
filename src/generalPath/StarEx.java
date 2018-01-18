package generalPath;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class StarEx extends JFrame {

	public StarEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Star");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				StarEx ex = new StarEx();
				ex.setVisible(true);
			}
		});
	}
}
