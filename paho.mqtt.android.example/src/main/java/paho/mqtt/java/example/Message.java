package paho.mqtt.java.example;

import android.graphics.Point;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by romane on 23/03/17.
 */

public class Message {
    private String id;
    private LatLng coord;

    public Message(){};
    public Message(String id, LatLng coord){
        this.id=id;
        this.coord=coord;
    }
    public Message(String s){
        String[] tab=s.split(":");
        id=tab[0];
        coord= new LatLng(Float.valueOf(tab[1]),Float.valueOf(tab[2]));
    }
    public void setId (String id){
        this.id=id;
    }

    public void setPoint(LatLng point){
        this.coord=point;
    }

    public String getId (){
        return id;
    }
    public LatLng getPoint(){
        return coord;
    }

    public String toString (){
        return id+":"+coord.latitude+":"+coord.longitude;
    }



}
