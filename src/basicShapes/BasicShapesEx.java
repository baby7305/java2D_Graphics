package basicShapes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class BasicShapesEx extends JFrame {

	public BasicShapesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Basic shapes");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				BasicShapesEx ex = new BasicShapesEx();
				ex.setVisible(true);
			}
		});
	}
}
