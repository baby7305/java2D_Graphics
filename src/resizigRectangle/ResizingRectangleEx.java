package resizigRectangle;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class ResizingRectangleEx extends JFrame {

	public ResizingRectangleEx()  {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Resize rectangle");
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ResizingRectangleEx ex = new ResizingRectangleEx();
				ex.setVisible(true);
			}
		});
	}
}
