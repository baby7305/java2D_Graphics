package basicStroke;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class BasicStrokesEx extends JFrame {

	public BasicStrokesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Basic strokes");
		setSize(280, 270);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			BasicStrokesEx ex = new BasicStrokesEx();
			ex.setVisible(true);
		});
	}
}
