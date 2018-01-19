package textAttributes;

import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.text.AttributedString;

/**
 * Created by Administrator on 2018/1/19.
 */
class Surface extends JPanel {

	private final String words = "Valour fate kinship darkness";
	private final String java = "Java TM";

	private void doDrawing(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);

		Font font = new Font("Serif", Font.PLAIN, 40);

		AttributedString as1 = new AttributedString(words);
		as1.addAttribute(TextAttribute.FONT, font);

		as1.addAttribute(TextAttribute.FOREGROUND, Color.red, 0, 6);
		as1.addAttribute(TextAttribute.UNDERLINE,
				TextAttribute.UNDERLINE_ON, 7, 11);
		as1.addAttribute(TextAttribute.BACKGROUND, Color.LIGHT_GRAY, 12, 19);
		as1.addAttribute(TextAttribute.STRIKETHROUGH,
				TextAttribute.STRIKETHROUGH_ON, 20, 28);

		g2d.drawString(as1.getIterator(), 15, 60);

		AttributedString as2 = new AttributedString(java);

		as2.addAttribute(TextAttribute.SIZE, 40);
		as2.addAttribute(TextAttribute.SUPERSCRIPT,
				TextAttribute.SUPERSCRIPT_SUPER, 5, 7);

		g2d.drawString(as2.getIterator(), 130, 125);
	}

	@Override
	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		doDrawing(g);
	}
}

