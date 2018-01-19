package sunAndCloud;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class SunAndCloudEx extends JFrame {

	public SunAndCloudEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Sun and cloud");
		setSize(300, 210);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				SunAndCloudEx ex = new SunAndCloudEx();
				ex.setVisible(true);
			}
		});
	}
}
