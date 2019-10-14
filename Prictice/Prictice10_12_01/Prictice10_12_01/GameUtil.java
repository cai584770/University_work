package Prictice10_12_01;

/*
 * º”‘ÿÕº∆¨¥˙¬Î
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class GameUtil {
	private GameUtil() {
	}
	
	public static Image getImage(String path) {
		BufferedImage bi = null;
		try {
			java.net.URL u = GameUtil.class.getClassLoader().getResource(path);
			bi = ImageIO.read(u);
		}catch (IOException e) {
		e.printStackTrace();
		}
		return bi;
	}
}
