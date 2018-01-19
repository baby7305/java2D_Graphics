package clippingShapes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ClippingShapesEx extends JFrame {

	public ClippingShapesEx() {

		initUI();
	}

	private void initUI() {

		setTitle("Clipping shapes");

		add(new Surface());

		setSize(350, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ClippingShapesEx ex = new ClippingShapesEx();
				ex.setVisible(true);
			}
		});
	}
}
