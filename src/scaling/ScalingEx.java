package scaling;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ScalingEx extends JFrame {

	public ScalingEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Scaling");
		setSize(330, 160);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				ScalingEx ex = new ScalingEx();
				ex.setVisible(true);
			}
		});
	}
}
