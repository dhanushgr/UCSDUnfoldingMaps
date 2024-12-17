package module1;
import processing.core.PApplet;
import processing.core.PImage;

public class ChangingSunColor extends PApplet {

	PImage img;

	public void setup() {
		size(800, 600, P3D);
		stroke(0);
		img = loadImage("bluesky.jpg");
		img.resize(0, height);
		image(img, 0, 0);
	}

	/** Draw the Applet window. */
	public void draw() {
		int[] color = sunColorSecond(second());
		fill(color[0],color[1],color[2]);
		ellipse(width/4, height/5, width/5, height/5);

	}

	private int[] sunColorSecond(float seconds) {
		int[] rgb = new int[3];
		/*
		scale the brightness of yellow based on seconds.
		30 seconds is black and 0 seconds is bright yellow.
		 */
		/*
		calculates difference between time that have elapsed with 30 seconds
		0-30
		1-30
		2-30
		and goes on
		.abs is used because we dont care about the negative integers here

		 */
		float diffFrom30 = Math.abs(30-seconds);

		float ratio = diffFrom30/30;
		rgb[0] = (int)(255*ratio);
		rgb[1] = (int)(255*ratio);
		rgb[2] = 0;

		return rgb;
	}

	public static void main(String[] args) {
		PApplet.main("module1.ChangingSunColor");
	}
}
