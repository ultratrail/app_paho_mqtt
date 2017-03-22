package paho.mqtt.java.example;

import java.util.ArrayList;

/**
 * Created by romane on 22/03/17.
 */
public class Menbres {
    public ArrayList<String> menbres;
    private static Menbres ourInstance = new Menbres(new ArrayList<String>());

    public static Menbres getInstance() {
        return ourInstance;
    }

    private Menbres(ArrayList<String> arrayList) {
        this.menbres=arrayList;
    }

    public int nb_menbres (){
        return menbres.size();
    }


}
