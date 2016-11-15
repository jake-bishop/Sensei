package com.geekmode.sensei;

import android.app.Service;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.sensor_list)
    RecyclerView sensorRecyclerView;

    private LinearLayoutManager layoutManager;
    private SensorListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutManager = new LinearLayoutManager(this);
        sensorRecyclerView.setLayoutManager(layoutManager);

        adapter = new SensorListAdapter();
        sensorRecyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();

        SensorManager sensorManager = (SensorManager) getSystemService(Service.SENSOR_SERVICE);
        List<Sensor> sensorList = sensorManager.getSensorList(Sensor.TYPE_PRESSURE);
        adapter.setSensors(sensorList);

    }
}
