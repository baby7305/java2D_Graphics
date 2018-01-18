package introduction;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class BasicEx extends JFrame {

	public BasicEx() {
		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Simple Java 2D example");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			BasicEx ex = new BasicEx();
			ex.setVisible(true);
		});
	}
}
