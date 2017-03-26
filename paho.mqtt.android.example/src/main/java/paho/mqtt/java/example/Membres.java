package paho.mqtt.java.example;

import java.util.ArrayList;

/**
 * Created by romane on 22/03/17.
 */
public class Membres {
    private ArrayList<String> membres;

    //a changer
    private Mqtt_client mqtt_clients;

    private static Membres ourInstance = new Membres(new ArrayList<String>());

    public static Membres getInstance() {
        return ourInstance;
    }

    private Membres(ArrayList<String> arrayList) {
        this.membres=arrayList;

        membres.add("Client2");
        membres.add("Benoit");
        membres.add("Cyril");
        membres.add("David");
        membres.add("Eloise");
        membres.add("Florent");

    }

    public int nb_Membres (){
        return membres.size();
    }

    public void setMqtt_clients(Mqtt_client mqtt_client){
        this.mqtt_clients=mqtt_client;
    }

    //peut etre a enlever
    public Mqtt_client getMqtt_clients(){
        return mqtt_clients;
    }

    public void add(String a_ajouter){
        this.membres.add(a_ajouter);
        mqtt_clients.subscribeToTopic(a_ajouter);
    }

    public ArrayList<String> getMembres() {
        return membres;
    }

    public String get(int position) {
        return membres.get(position);
    }

}
