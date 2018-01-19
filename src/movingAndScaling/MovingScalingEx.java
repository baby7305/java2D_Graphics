package movingAndScaling;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class MovingScalingEx extends JFrame {

	public MovingScalingEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Moving and scaling");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				MovingScalingEx ex = new MovingScalingEx();
				ex.setVisible(true);
			}
		});
	}
}
