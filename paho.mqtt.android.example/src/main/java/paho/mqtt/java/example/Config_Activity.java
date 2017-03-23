package paho.mqtt.java.example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Config_Activity extends AppCompatActivity {

    ListView myListView;
    FloatingActionButton button_add_device;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bluetooth_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        button_add_device = (FloatingActionButton) findViewById(R.id.Add_device);
        button_add_device.setOnClickListener(add_deviceListener);

        myListView = (ListView) findViewById(R.id.list);
        printDevices();

        /*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
 */
    }


    View.OnClickListener add_deviceListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            //TODO  add a bluetooth device. New activity ?

        }
    };



    private void printDevices(){
        List<BluetoothDevice> devices = generateDevices();

        BluetoothDeviceAdapter adapter = new BluetoothDeviceAdapter(Config_Activity.this, devices);
        myListView.setAdapter(adapter);

    }

    private List<BluetoothDevice> generateDevices() {
        List<BluetoothDevice> devicesList = new ArrayList<BluetoothDevice>();
        devicesList.add(new BluetoothDevice("Ceinture"));
        devicesList.add(new BluetoothDevice("montre"));
        devicesList.add(new BluetoothDevice("chaussure"));
        return devicesList;
    }


}
