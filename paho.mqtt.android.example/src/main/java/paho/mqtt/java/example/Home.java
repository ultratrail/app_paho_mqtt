package paho.mqtt.java.example;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import org.eclipse.paho.android.service.MqttAndroidClient;
import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallbackExtended;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
// client mqtt
        Mqtt_client mqtt_client= new Mqtt_client(getApplicationContext());
        Menbres menbres =Menbres.getInstance();
        menbres.setMqtt_clients(mqtt_client);

//


        Button Config = (Button) findViewById(R.id.configuration) ;
        Config.setOnClickListener(Listener_config);

        Button Groupe = (Button) findViewById(R.id.groupe);
        Groupe.setOnClickListener(Listener_groupe);


    }

    View.OnClickListener Listener_config = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent myIntent = new Intent(Home.this, Config_Activity.class);
            startActivity(myIntent);
        }
    };

    View.OnClickListener Listener_groupe = new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent myIntent = new Intent(Home.this, Groupe_Activity.class);
            startActivity( myIntent);
        }
    };



}
