package points;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by Administrator on 2018/1/18.
 */
public class PointsEx extends JFrame {

	public PointsEx() {

		initUI();
	}

	private void initUI() {

		final Surface surface = new Surface();
		add(surface);

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				Timer timer = surface.getTimer();
				timer.stop();
			}
		});

		setTitle("Points");
		setSize(350, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				PointsEx ex = new PointsEx();
				ex.setVisible(true);
			}
		});
	}
}
