package module3;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class AddingMarker extends PApplet{

    private UnfoldingMap map;

    public void setup(){
        size(950,600, P3D);
        map = new UnfoldingMap(this, 0,0,width, height);
        map.zoomToLevel(1);
        MapUtils.createDefaultEventDispatcher(this, map);

        Location location = new Location(-38.14f, -73.03f);
        Marker val = new SimplePointMarker(location);
        map.addMarker(val);
    }

    public void draw(){
        background(200);
        map.draw();
    }

    public static void main(String[] args) {
        PApplet.main("module3.AddingMarker");
    }
}
