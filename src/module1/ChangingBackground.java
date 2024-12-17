package module1;
import processing.core.PApplet;
import processing.core.PImage;

public class ChangingBackground extends PApplet {

	PImage img;

	public void setup() {
		size(800, 600, P3D);
		img = loadImage("bluesky.jpg");
	}

	/** Draw the Applet window. */
	public void draw() {
		img.resize(0, height);
		image(img, 0, 0);
		fill(255,255,0);
		ellipse(width/4, height/5, width/5, height/5);

	}

	public static void main(String[] args) {
		PApplet.main("module1.ChangingBackground");
	}
}
