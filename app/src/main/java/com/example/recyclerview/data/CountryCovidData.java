package com.example.recyclerview.data;

import java.io.Serializable;

public class CountryCovidData implements Serializable {
    public String ActiveCasesText;
    public String CountryText;
    String NewCasesText;
    String NewDeathsText;
    public String TotalCasesText;
    public String TotalDeathsText;
    String TotalRecoveredText;

    public CountryCovidData(String ActiveCasesText,
                            String CountryText,
                            String NewCasesText,
                            String NewDeathsText,
                            String TotalCasesText,
                            String TotalDeathsText,
                            String TotalRecoveredText) {
        this.ActiveCasesText = ActiveCasesText;
        this.CountryText = CountryText;
        this.NewCasesText = NewCasesText;
        this.NewDeathsText = NewDeathsText;
        this.TotalCasesText = TotalCasesText;
        this.TotalDeathsText = TotalDeathsText;
        this.TotalRecoveredText = TotalRecoveredText;
    }
}
