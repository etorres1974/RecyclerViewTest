package com.example.recyclerview.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.recyclerview.R;
import com.example.recyclerview.data.CountryCovidData;
import com.example.recyclerview.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (getArguments() != null) {
            CountryCovidData data = (CountryCovidData) getArguments().getSerializable(FirstFragment.DATA_KEY);
            setupDataView(data);
        }
    }

    public void setupDataView(CountryCovidData data){
        if(data != null) {
            binding.tvTitle.setText(data.CountryText);
            setTextOrHide(binding.tvActiveCases, R.string.active_cases, data.ActiveCasesText);
            setTextOrHide(binding.tvNewCases, R.string.new_cases, data.NewCasesText);
            setTextOrHide(binding.tvTotalCase, R.string.total_cases, data.TotalCasesText);
            setTextOrHide(binding.tvNewDeaths, R.string.new_deaths, data.NewDeathsText);
            setTextOrHide(binding.tvTotalDeaths, R.string.total_deaths, data.TotalDeathsText);
            setTextOrHide(binding.tvTotalRecovered, R.string.total_recovered, data.TotalRecoveredText);
        }
    }

    public void setTextOrHide(TextView view, int res,  String text){
        if(text == null || text.isEmpty())
            view.setVisibility(View.GONE);
        else
            view.setVisibility(View.VISIBLE);
        view.setText(getString(res, text));
    }

}