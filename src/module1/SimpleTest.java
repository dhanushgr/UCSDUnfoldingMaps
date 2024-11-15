package module1;

import processing.core.PApplet;

public class SimpleTest extends PApplet {
    public void setup() {
        size(800, 600, P3D);  // OpenGL renderer (P3D)
        background(200, 200, 200);
    }

    public void draw() {
        ellipse(mouseX, mouseY, 50, 50);
    }

    public static void main(String[] args) {
        PApplet.main("module1.SimpleTest");
    }
}

