package paho.mqtt.java.example;

import java.util.ArrayList;

/**
 * Created by romane on 22/03/17.
 */
public class Menbres {
    public ArrayList<String> menbres;

    //a changer
    private Mqtt_client mqtt_clients;

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

    public void setMqtt_clients(Mqtt_client mqtt_client){
        this.mqtt_clients=mqtt_client;
    }

    //peut etre a enlever
    public Mqtt_client getMqtt_clients(){
        return mqtt_clients;
    }

    public void add(String a_ajouter){
        this.menbres.add(a_ajouter);
        mqtt_clients.subscribeToTopic(a_ajouter);
    }

}
