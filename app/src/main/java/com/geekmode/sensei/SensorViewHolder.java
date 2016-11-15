package com.geekmode.sensei;

import android.hardware.Sensor;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class SensorViewHolder extends RecyclerView.ViewHolder {
    TextView sensorName;
    TextView sensorDescription;

    public SensorViewHolder(View itemView) {
        super(itemView);

        sensorName = (TextView) itemView.findViewById(R.id.sensor_name);
        sensorDescription = (TextView) itemView.findViewById(R.id.sensor_description);
    }

    public void bindView(Sensor sensor) {
        sensorName.setText(sensor.getName());
        sensorDescription.setText(sensor.getType());
    }
}
