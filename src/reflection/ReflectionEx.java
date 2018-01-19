package reflection;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ReflectionEx extends JFrame {

	public ReflectionEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());
		pack();

		setTitle("Reflection");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				ReflectionEx ex = new ReflectionEx();
				ex.setVisible(true);
			}
		});
	}
}
