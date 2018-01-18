package lines;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class LinesEx extends JFrame {

	public LinesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Lines");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			LinesEx ex = new LinesEx();
			ex.setVisible(true);
		});
	}
}
