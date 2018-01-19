package displayingAnImage;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class DisplayImageEx extends JFrame {

	public DisplayImageEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		pack();

		setTitle("Mushrooms");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				DisplayImageEx ex = new DisplayImageEx();
				ex.setVisible(true);
			}
		});
	}
}
