package com.geekmode.sensei;

import android.hardware.Sensor;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SensorListAdapter extends RecyclerView.Adapter<SensorViewHolder> {

    private List<Sensor> sensorList;

    public void setSensors(List<Sensor> sensorList) {
        this.sensorList = sensorList;
        notifyDataSetChanged();
    }

    @Override
    public SensorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sensor_item, parent, false);
        return new SensorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SensorViewHolder holder, int position) {
        holder.bindView(sensorList.get(position));
    }

    @Override
    public int getItemCount() {
        return sensorList.size();
    }
}
