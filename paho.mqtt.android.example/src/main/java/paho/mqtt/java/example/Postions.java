package paho.mqtt.java.example;

import android.graphics.Point;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by romane on 23/03/17.
 */
public class Postions {
    public LatLng myPosition;
    public HashMap<String,LatLng> positions;

    private static Postions ourInstance = new Postions();

    public static Postions getInstance() {
        return ourInstance;
    }

    private Postions() {
        positions= new HashMap<>();
        // peut etre recuperer dans un fichier les anciennes ?
    }

    public void modfierPosition (LatLng point, String s){
        positions.put(s,point);
        //modifier la carte
    }

    public LatLng getPosition (String s){
        return positions.get(s);
    }


}
