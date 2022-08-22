package com.example.recyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
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
        binding.tvActiveCases.setText( "ActiveCases : " + data.ActiveCasesText);
        binding.tvTotalCases.setText( "TotalCases : " + data.TotalCasesText);
        binding.tvTotalDeaths.setText( "TotalCases : " + data.TotalDeathsText);
        hideEmptyValues(data);
    }

    public void hideEmptyValues(CountryCovidData data){
        hideIfEmpty(binding.tvActiveCases);
        hideIfEmpty(binding.tvTotalCases);
        hideIfEmpty(binding.tvTotalDeaths);
    }

    public void hideIfEmpty(TextView view){
        if(view.getText() == null || view.getText().toString().isEmpty())
            binding.tvActiveCases.setVisibility(View.GONE);
        else
            binding.tvActiveCases.setVisibility(View.VISIBLE);
    }

    public static CovidDataViewHolder inflate(ViewGroup viewGroup){
        LayoutInflater inflater  = LayoutInflater.from(viewGroup.getContext());
        CovidDataItemBinding binding = CovidDataItemBinding.inflate(inflater, viewGroup, false);
        return new CovidDataViewHolder(binding);
    }
}
