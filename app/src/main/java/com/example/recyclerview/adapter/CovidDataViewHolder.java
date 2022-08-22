package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.example.recyclerview.data.CountryCovidData;
import com.example.recyclerview.databinding.CovidDataItemBinding;

public class CovidDataViewHolder extends RecyclerView.ViewHolder {
    private final CovidDataItemBinding binding;

    public CovidDataViewHolder(CovidDataItemBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(CountryCovidData data){
        binding.tvText.setText(data.CountryText);
    }

    public static CovidDataViewHolder inflate(ViewGroup viewGroup){
        LayoutInflater inflater  = LayoutInflater.from(viewGroup.getContext());
        CovidDataItemBinding binding = CovidDataItemBinding.inflate(inflater, viewGroup, false);
        return new CovidDataViewHolder(binding);
    }
}
