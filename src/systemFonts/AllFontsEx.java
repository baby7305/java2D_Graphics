package systemFonts;

import java.awt.*;

/**
 * Created by Administrator on 2018/1/19.
 */
public class AllFontsEx {

	public static void main(String[] args) {

		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		Font[] fonts = ge.getAllFonts();

		for (Font font : fonts) {
			System.out.print(font.getFontName() + " : ");
			System.out.println(font.getFamily());
		}
	}
}
