package translation;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class TranslationEx extends JFrame {

	public TranslationEx() {

		initUI();
	}

	private void initUI() {

		add(new Surface());

		setTitle("Translation");
		setSize(300, 200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {

				TranslationEx ex = new TranslationEx();
				ex.setVisible(true);
			}
		});
	}
}
