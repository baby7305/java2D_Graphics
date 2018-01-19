package operations;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class CompositionEx extends JFrame {

	public CompositionEx() {

		add(new Surface());

		setTitle("Composition");
		setSize(400, 120);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				CompositionEx ex = new CompositionEx();
				ex.setVisible(true);
			}
		});
	}
}
