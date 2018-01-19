package textAttributes;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class TextAttributesEx extends JFrame {

	public TextAttributesEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setSize(620, 190);
		setTitle("Text attributes");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				TextAttributesEx ex = new TextAttributesEx();
				ex.setVisible(true);
			}
		});
	}
}
