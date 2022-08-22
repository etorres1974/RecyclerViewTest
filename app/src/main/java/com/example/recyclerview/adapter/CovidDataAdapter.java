package com.example.recyclerview.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.data.CountryCovidData;
import java.util.List;

public class CovidDataAdapter extends RecyclerView.Adapter<CovidDataViewHolder> {

    private final List<CountryCovidData> localDataSet;

    public CovidDataAdapter(List<CountryCovidData> dataSet) {
        localDataSet = dataSet;
    }

    @NonNull
    @Override
    public CovidDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return CovidDataViewHolder.inflate(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull CovidDataViewHolder holder, int position) {
        holder.bind(localDataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}