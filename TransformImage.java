import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.util.*;
import java.awt.Component;

/**
** Mvah Fabrice
** Tranform image version 1.0
**/

public class TransformImage {
	
	public static void markImage(String pathSrc, String pathMarker, String pathDest, 
		     int initAbs, int endAbs, int initOrd, int endOrd, float opacity) throws IOException{

		BufferedImage imgSource = ImageIO.read(new File(pathSrc));
	    BufferedImage marker = ImageIO.read(new File(pathMarker));
	    Graphics2D g = imgSource.createGraphics();
	    g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, opacity));
	    g.drawImage(marker, initAbs, initOrd, endAbs, endOrd,  null);
	    g.dispose();
	    ImageIO.write(imgSource, "jpeg", new File(""+pathDest+"/output.jpeg"));
	}

	public static void main(String[] args) throws IOException {
	   	
	  markImage("source/a2.jpg", "source/logo.PNG", "output", 40, 200, 10, 180, 0.2f);
	}

}