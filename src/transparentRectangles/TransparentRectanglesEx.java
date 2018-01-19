package transparentRectangles;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class TransparentRectanglesEx extends JFrame {

	public TransparentRectanglesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Transparent rectangles");
		setSize(590, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				TransparentRectanglesEx ex = new TransparentRectanglesEx();
				ex.setVisible(true);
			}
		});
	}
}
