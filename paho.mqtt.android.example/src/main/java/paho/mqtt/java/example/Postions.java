package paho.mqtt.java.example;

import android.graphics.Point;
import android.widget.TextView;

//import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by romane on 23/03/17.
 */
public class Postions {
    public Point myPosition= new Point(100,100);
    public HashMap<String,Point> positions;
    public TextView t;

    private static Postions ourInstance = new Postions();

    public static Postions getInstance() {
        return ourInstance;
    }

    private Postions() {
        positions= new HashMap<>();
        // peut etre recuperer dans un fichier les anciennes ?
    }

    public void modfierPosition (Point point, String s){
        positions.put(s,point);
        //modifier la carte
        t.setText(t.getText()+ "\n"+s +":"+point.toString());
    }

    public Point getPosition (String s){
        return positions.get(s);
    }




}
