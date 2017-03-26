package paho.mqtt.java.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Map_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        final Membres m =Membres.getInstance();
        final Mqtt_client mqtt_client= m.getMqtt_clients();
        final Postions p = Postions.getInstance();
        Button b = (Button) findViewById(R.id.publish);
        TextView t = (TextView) findViewById((R.id.textView2));
        p.t=t;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                p.myPosition.x= p.myPosition.x +10;
                p.myPosition.y= p.myPosition.y +10;
                mqtt_client.publishMessage();
                //TODO

            }
        });

        t.setText("pas encore de message ");


    }



}
