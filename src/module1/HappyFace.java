package module1;

import processing.core.PApplet;

public class HappyFace extends PApplet {

    public void setup(){
        size(500, 500); //size of the applet window
        background(200, 200, 200); //background color of the applet window
    }

    public void draw(){
        /*
            ellipse parameters:
            ellipse(a, b, c, d)
            a	(float)	x-coordinate of the ellipse
            b	(float)	y-coordinate of the ellipse
            c	(float)	width of the ellipse by default
            d	(float)	height of the ellipse by default
         */
        fill(255,255, 0);
        ellipse(250,250,250,250);
        fill(225,0,0);
        ellipse(200, 225, 50, 50);
        ellipse(300, 225, 50, 50);

        fill(100,100,100);
        arc(250,300, 75, 50, 0, PI);
    }

    public static void main(String[] args) {
        PApplet.main("module1.HappyFace");
    }
}
