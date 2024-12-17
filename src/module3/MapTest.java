package module3;

import com.sun.org.apache.bcel.internal.generic.NEW;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

import java.awt.image.ImageProducer;

public class MapTest extends PApplet {

    private UnfoldingMap map;

    public void setup(){
        size(950,600, P3D);  //sets the size of the applet canvas
        map = new UnfoldingMap(this, 0,0,width,height); //creates a WorldMap
        map.zoomToLevel(1); //zooms the whole to the level of 1 or 2 or any number
        MapUtils.createDefaultEventDispatcher(this, map);   //lets the map to be dynamic and lets us zoom in.
    }

    public void draw(){
        background(10); //sets the background of the applet to black
        map.draw(); //map is being displayed
    }

    public static void main(String[] args) {
        PApplet.main("module3.MapTest");
    }
}
