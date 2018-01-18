package areas;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/18.
 */
public class AreasEx extends JFrame {

	public AreasEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Areas");
		setSize(450, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				AreasEx ex = new AreasEx();
				ex.setVisible(true);
			}
		});
	}
}
