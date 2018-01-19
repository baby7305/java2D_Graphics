package hitTesting;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class HitTestingEx extends JFrame {

	public HitTestingEx() {

		add(new Surface());

		setTitle("Hit testing");
		setSize(250, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				HitTestingEx ex = new HitTestingEx();
				ex.setVisible(true);
			}
		});
	}
}
