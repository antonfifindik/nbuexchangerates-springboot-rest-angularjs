package com.antonfifindik.service;

import com.antonfifindik.json.JsonReader;
import com.antonfifindik.model.ExchangeRate;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class NbuExchangeRatesService {

    private static List<ExchangeRate> ratesList = new ArrayList<>();

    @Autowired
    private static JsonReader jsonReader;

    static {
        try {
            JSONArray jsonArray = jsonReader.readJsonFromUrl("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json");
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                ratesList.add(new ExchangeRate(jsonObject.getString("txt"), jsonObject.getDouble("rate"),
                        jsonObject.getString("cc"), jsonObject.getInt("r030"), jsonObject.getString("exchangedate")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ExchangeRate> findAll() {
        return ratesList;
    }

    public static void main(String[] args) {
        for(ExchangeRate exchangeRate : findAll())
            System.out.println(exchangeRate);
    }

}
